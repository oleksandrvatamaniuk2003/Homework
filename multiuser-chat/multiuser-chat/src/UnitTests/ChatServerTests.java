/**
 * @Author: Vatamaniuk Olexandr
 * @Created: December 21, 2023
 */

package UnitTests;

import Server.ChatServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.net.Socket;

public class ChatServerTests {
    private ChatServer server;
    private Socket clientSocket;

    @BeforeEach
    public void setUp() {
        server = new ChatServer();
        new Thread(() -> server.start()).start();
    }

    @AfterEach
    public void tearDown() {
        try {
            if (clientSocket != null && !clientSocket.isClosed()) {
                clientSocket.close();
            }
            server.closeServerSocket();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLoginSuccess() {
        connectClient();
        sendMessage("LOGIN#user1");
        assertEquals("SUCCESS", receiveMessage());
    }

    @Test
    public void testLoginFailure() {
        connectClient();
        sendMessage("LOGIN#user1");
        assertEquals("SUCCESS", receiveMessage());

        sendMessage("LOGIN#user1");
        assertEquals("FAIL", receiveMessage());
    }

    @Test
    public void testLogout() {
        connectClient();
        sendMessage("LOGIN#user1");
        assertEquals("SUCCESS", receiveMessage());

        sendMessage("LOGOUT#user1");
        assertEquals("LOGOUT#user1", receiveMessage());
    }

    @Test
    public void testSendOne() {
        connectClient();
        sendMessage("LOGIN#user1");
        assertEquals("SUCCESS", receiveMessage());

        Socket anotherClientSocket = connectClient();
        sendMessage("LOGIN#user2", anotherClientSocket);
        assertEquals("SUCCESS", receiveMessage(anotherClientSocket));

        sendMessage("SENDONE#user1#Hello, user1!", anotherClientSocket);
        assertEquals("SENDONE#user1#Hello, user1!", receiveMessage());
    }

    @Test
    public void testSendAll() {
        connectClient();
        sendMessage("LOGIN#user1");
        assertEquals("SUCCESS", receiveMessage());

        Socket anotherClientSocket = connectClient();
        sendMessage("LOGIN#user2", anotherClientSocket);
        assertEquals("SUCCESS", receiveMessage(anotherClientSocket));

        sendMessage("SENDALL#user1#Hello, everyone!");
        assertEquals("SENDALL#user1#Hello, everyone!", receiveMessage());
        assertEquals("SENDALL#user1#Hello, everyone!", receiveMessage(anotherClientSocket));
    }

    private Socket connectClient() {
        try {
            clientSocket = new Socket("localhost", 8888);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientSocket;
    }

    private void sendMessage(String message) {
        sendMessage(message, clientSocket);
    }

    private void sendMessage(String message, Socket socket) {
        try (DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {
            out.writeUTF(message);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String receiveMessage() {
        return receiveMessage(clientSocket);
    }

    private String receiveMessage(Socket socket) {
        try (DataInputStream in = new DataInputStream(socket.getInputStream())) {
            return in.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
