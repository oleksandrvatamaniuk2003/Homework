package connection;

public class ConnectionManager {
    private static final int MAX_CONNECTIONS = 5;
    private static Connection[] connections = new Connection[MAX_CONNECTIONS];
    private static int currentIndex = 0;
    static {
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            connections[i] = new Connection();
        }
    }
    public static Connection getConnection() {
        if (currentIndex < MAX_CONNECTIONS) {
            return connections[currentIndex++];
        } else {
            System.out.println("0 connections.");
            return null;
        }
    }
    public static void releaseConnection(Connection connection) {
        if (connection != null) {
            connection.closeConnection();
            currentIndex--;
        }
    }
}
