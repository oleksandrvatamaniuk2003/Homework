/**
 * @Author: Vatamaniuk Olexandr
 * @Created: December 21, 2023
 */

package Server;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * The ChatServer class represents a simple multi-client chat server.
 */
public class ChatServer {
    private ServerSocket serverSocket;
    private boolean isRunning = false;
    private Map<String, ChatClientHandler> clients = new HashMap<>();

    /**
     * The main method to start the ChatServer.
     *
     * @param args Command line arguments (not used in this implementation).
     */
    public static void main(String args[]) {
        new ChatServer().start();
    }

    /**
     * Starts the chat server, binds to a specified port, and listens for incoming client connections.
     */
    public void start() {
        try {
            serverSocket = new ServerSocket(8888);
            isRunning = true;
            System.out.println("Server is running on 8888 port!");
        } catch (BindException e) {
            System.out.println("Error occurred while binding port.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (isRunning) {
                Socket clientSocket = serverSocket.accept();
                ChatClientHandler clientHandler = new ChatClientHandler(clientSocket);
                System.out.println("Client has been connected!");
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            System.out.println("Client has been disconnected!");
        } finally {
            try {
                if (serverSocket != null && !serverSocket.isClosed())
                    serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Closes the ServerSocket.
     */
    public void closeServerSocket() {
        try {
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * The ChatClientHandler class represents a connected client and implements the Runnable interface.
     */
    private class ChatClientHandler implements Runnable {
        private Socket clientSocket;
        private String userName = "";
        private DataInputStream inputStream = null;
        private DataOutputStream outputStream = null;
        private boolean isConnected = false;
        private BufferedOutputStream fileOutputStream = null;

        /**
         * Constructs a new ChatClientHandler object.
         *
         * @param clientSocket The Socket representing the client connection.
         */
        public ChatClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
            try {
                inputStream = new DataInputStream(clientSocket.getInputStream());
                outputStream = new DataOutputStream(clientSocket.getOutputStream());
                isConnected = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * The run method that handles client communication.
         */
        @Override
        public void run() {
            try {
                while (isConnected) {
                    String messageParts[] = inputStream.readUTF().split("#");
                    switch (messageParts[0]) {
                        case "LOGIN":
                            String requestedUserName = messageParts[1];
                            if (clients.containsKey(requestedUserName)) {
                                outputStream.writeUTF("FAIL");
                                System.out.println("Connection was canceled...");
                                closeConnection();
                            } else {
                                outputStream.writeUTF("SUCCESS");
                                clients.put(requestedUserName, this);

                                StringBuffer allUsers = new StringBuffer();
                                allUsers.append("ALLUSERS#");
                                for (String user : clients.keySet())
                                    allUsers.append(user + "#");
                                outputStream.writeUTF(allUsers.toString());

                                String newLogin = "LOGIN#" + requestedUserName;
                                sendMessage(requestedUserName, newLogin);
                                this.userName = requestedUserName;
                            }
                            break;
                        case "LOGOUT":
                            clients.remove(this.userName);
                            String logoutMessage = "LOGOUT#" + this.userName;
                            sendMessage(this.userName, logoutMessage);
                            System.out.println("User: " + this.userName + " is offline");
                            closeConnection();
                            break;
                        case "SENDONE":
                            ChatClientHandler recipientClient = clients.get(messageParts[1]);
                            String messageToSendToOne = "";
                            if (recipientClient != null) {
                                messageToSendToOne = "SENDONE#" + this.userName + "#" + messageParts[2];
                                recipientClient.outputStream.writeUTF(messageToSendToOne);
                                recipientClient.outputStream.flush();
                            }
                            break;
                        case "SENDALL":
                            String messageToSendAll = "SENDALL#" + this.userName + "#" + messageParts[1];
                            sendMessage(this.userName, messageToSendAll);
                            break;
                    }
                }
            } catch (IOException e) {
                System.out.println("Client has been disconnected!");
                isConnected = false;
            } finally {
                try {
                    if (inputStream != null)
                        inputStream.close();
                    if (outputStream != null)
                        outputStream.close();
                    if (fileOutputStream != null)
                        fileOutputStream.close();
                    if (clientSocket != null)
                        clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * Closes the client connection.
         */
        public void closeConnection() {
            isConnected = false;
            try {
                if (inputStream != null)
                    inputStream.close();
                if (outputStream != null)
                    outputStream.close();
                if (clientSocket != null)
                    clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * Sends a message to all connected clients except the sender.
         *
         * @param fromUser The username of the sender.
         * @param message  The message to be sent.
         */
        public void sendMessage(String fromUser, String message) {
            String recipientUser = "";
            try {
                for (String toUser : clients.keySet()) {
                    if (!toUser.equals(fromUser)) {
                        recipientUser = toUser;
                        DataOutputStream out = clients.get(toUser).outputStream;
                        out.writeUTF(message);
                        out.flush();
                    }
                }
            } catch (IOException e) {
                System.out.println("User: " + recipientUser + " is offline");
            }
        }
    }
}
