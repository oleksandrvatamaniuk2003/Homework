//package UnitTests;
//
//import Client.ChatClient;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class ChatClientTest {
//
//    @Test
//    void testLogin() {
//        ChatClient chatClient = new ChatClient();
//        chatClient.start();
//        chatClient.userSelection1.setSelectedIndex(1);
//        chatClient.clientThread.login();
//
//        assertTrue(chatClient.clientThread.isLoggedIn);
//    }
//
//    @Test
//    void testSendMsg() {
//        ChatClient chatClient = new ChatClient();
//        chatClient.start();
//        chatClient.userSelection1.setSelectedIndex(1);
//        chatClient.clientThread.login();
//
//        // Set up the necessary components
//        chatClient.messageInputArea.setText("Test Message");
//        chatClient.userSelection2.setSelectedIndex(1);
//
//        chatClient.clientThread.sendMsg();
//
//        assertEquals("Я:Test Message\n", chatClient.chatDisplayArea.getText());
//    }
//
//    @Test
//    void testLogout() {
//        ChatClient chatClient = new ChatClient();
//        chatClient.start(); // Initialize the GUI
//        chatClient.userSelection1.setSelectedIndex(1);
//        chatClient.clientThread.login();
//
//        chatClient.clientThread.exit();
//
//        assertFalse(chatClient.clientThread.isLoggedIn);
//    }
//
//    @Test
//    void testShowMsg() {
//        ChatClient chatClient = new ChatClient();
//        chatClient.start();
//
//        chatClient.showMsg("Test Message");
//
//        assertEquals("Test Message\n", chatClient.chatDisplayArea.getText());
//    }
//}
