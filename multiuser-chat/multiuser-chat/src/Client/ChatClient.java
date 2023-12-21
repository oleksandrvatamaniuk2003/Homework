package Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.net.SocketException;

/**
 * The ChatClient class represents a simple GUI-based chat client.
 */
public class ChatClient extends JFrame {
    private JTextArea messageInputArea, chatDisplayArea;
    JPanel panel1, panel11, panel12, panel2, panel21, panel22;
    JComboBox<String> userSelection1, userSelection2;
    private ReceiveThread clientThread = null;

    /**
     * Starts the chat client GUI.
     */
    public void start() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width / 2;
        int screenHeight = screenSize.height / 2;
        int height = getHeight();
        int width = getWidth();
        setSize(350, 400);
        setLocation((screenWidth - width) / 2, (screenHeight - height) / 2);

        // Setting up the messageInputArea
        messageInputArea = new JTextArea(3, 10);
        messageInputArea.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        messageInputArea.setLineWrap(true);
        messageInputArea.setWrapStyleWord(true);
        messageInputArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if ('\n' == e.getKeyCode())
                    if (clientThread != null) {
                        clientThread.sendMsg();
                    }
            }
        });

        // Setting up the chatDisplayArea
        chatDisplayArea = new JTextArea(6, 10);
        chatDisplayArea.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));

        // Setting up the panels and components
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel11 = new JPanel();
        panel11.setLayout(new GridLayout(1, 2));
        JLabel label1 = new JLabel("Choose your username:");
        userSelection1 = new JComboBox<>();
        userSelection1.addItem("---------select option---------");
        userSelection1.addItem("Elon Musk");
        userSelection1.addItem("Jeff Bezos");
        userSelection1.addItem("Mark Zuckerberg");
        userSelection1.addItem("Larry Page");

        userSelection1.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (userSelection1.getSelectedIndex() == 0) {
                    return;
                }
                clientThread = new ReceiveThread((String) userSelection1.getSelectedItem());
                new Thread(clientThread).start();
            }
        });
        panel11.add(label1);
        panel11.add(userSelection1);
        panel12 = new JPanel();
        panel12.setLayout(new GridLayout(1, 1));
        panel12.add(new JScrollPane(chatDisplayArea));
        panel1.add(panel11, BorderLayout.NORTH);
        panel1.add(panel12, BorderLayout.SOUTH);

        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel21 = new JPanel();
        panel21.setLayout(new GridLayout(2, 2));
        userSelection2 = new JComboBox<>();
        userSelection2.addItem("All users");
        JLabel label2 = new JLabel("Choose the user to send message below");
        panel21.add(label2);
        panel21.add(userSelection2);
        panel22 = new JPanel();
        panel22.setLayout(new GridLayout(1, 1));
        panel22.add(new JScrollPane(messageInputArea));
        panel2.add(panel21, BorderLayout.NORTH);
        panel2.add(panel22, BorderLayout.SOUTH);
        container.add(panel1, BorderLayout.NORTH);
        container.add(panel2, BorderLayout.SOUTH);

        // Set JFrame properties
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (clientThread != null)
                    clientThread.exit();
                System.exit(0);
            }
        });
    }

    /**
     * The ReceiveThread class represents a separate thread for handling communication with the server.
     */
    private class ReceiveThread implements Runnable {
        private Socket socket = null;
        private DataInputStream inputStream = null;
        private DataOutputStream outputStream = null;
        private String username;
        private boolean isLoggedIn = false;
        StringBuilder messageBuffer = new StringBuilder();

        /**
         * Constructs a new ReceiveThread object.
         *
         * @param username The chosen username for the client.
         */
        public ReceiveThread(String username) {
            this.username = username;
        }

        /**
         * Logs in to the server by establishing a socket connection and sending a LOGIN message.
         */
        public void login() {
            try {
                socket = new Socket("127.0.0.1", 8888);
                inputStream = new DataInputStream(socket.getInputStream());
                outputStream = new DataOutputStream(socket.getOutputStream());
                String sendMessage = "LOGIN#" + username;
                outputStream.writeUTF(sendMessage);
                outputStream.flush();

                String receivedMessage = inputStream.readUTF();
                if (receivedMessage.equals("FAIL")) {
                    showMsg(username + " has already been online!");
                    userSelection1.setEnabled(true);
                    exit();
                    return;
                } else if (receivedMessage.equals("SUCCESS")) {
                    showMsg("Successfully connected to the server");
                    userSelection1.setEnabled(false);
                    isLoggedIn = true;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * Logs out from the server by sending a LOGOUT message.
         */
        public void exit() {
            try {
                if (isLoggedIn) {
                    outputStream.writeUTF("LOGOUT");
                    outputStream.flush();
                    isLoggedIn = false;
                }
                if (inputStream != null)
                    inputStream.close();
                if (outputStream != null)
                    outputStream.close();
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                System.out.println("Disconnected!");
            }
        }

        /**
         * Sends a message to the server based on the selected user and content in the messageInputArea.
         */
        public void sendMsg() {
            if (!isLoggedIn) {
                showMsg("Please login!");
                return;
            }
            messageBuffer.setLength(0);
            String sendInfo = messageInputArea.getText().trim();
            String selectedUser = (String) userSelection2.getSelectedItem();
            if (sendInfo.equals(""))
                sendInfo = " ";
            try {
                if (selectedUser.equals("All users")) {
                    messageBuffer.append("SENDALL#");
                    messageBuffer.append(sendInfo);
                } else {
                    messageBuffer.append("SENDONE#");
                    messageBuffer.append(selectedUser + "#" + sendInfo);
                }
                outputStream.writeUTF(messageBuffer.toString());
                showMsg("Я:" + sendInfo);
                messageInputArea.setText("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * The run method that handles incoming messages from the server.
         */
        @Override
        public void run() {
            login();
            try {
                while (isLoggedIn) {
                    String messages[] = inputStream.readUTF().split("#");
                    switch (messages[0]) {
                        case "LOGIN":
                            userSelection2.addItem(messages[1]);
                            break;
                        case "ALLUSERS":
                            for (int i = 1; i < messages.length; i++) {
                                if (!"".equals(messages[i]))
                                    userSelection2.addItem(messages[i]);
                            }
                            break;
                        case "SENDONE":
                            showMsg(messages[1] + ": " + messages[2]);
                            break;
                        case "SENDALL":
                            showMsg(messages[1] + ": " + messages[2]);
                            break;
                        case "LOGOUT":
                            showMsg("Notification: " + messages[1] + " is offline!");
                            userSelection2.removeItem(messages[1]);
                            break;
                    }
                }
            } catch (SocketException e) {
                System.out.println(username + " has left...");
            } catch (IOException e) {
                isLoggedIn = false;
                e.printStackTrace();
            }
        }
    }

    /**
     * Appends a message to the chatDisplayArea.
     *
     * @param msg The message to be displayed.
     */
    public void showMsg(String msg) {
        chatDisplayArea.append(msg + "\n");
        chatDisplayArea.setCaretPosition(chatDisplayArea.getText().length());
    }

    /**
     * The main method to start the ChatClient.
     *
     * @param args Command line arguments (not used in this implementation).
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new ChatClient().start();
    }
}
