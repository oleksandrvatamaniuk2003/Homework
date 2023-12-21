import connection.Connection;
import connection.ConnectionManager;

public class MainProgramConnection {
    public static void main(String[] args) {
        Connection connection1 = ConnectionManager.getConnection();
        Connection connection2 = ConnectionManager.getConnection();
        Connection connection3 = ConnectionManager.getConnection();
        Connection connection4 = ConnectionManager.getConnection();
        Connection connection5 = ConnectionManager.getConnection();
        Connection connection6 = ConnectionManager.getConnection();  // No available connections
        ConnectionManager.releaseConnection(connection2);
        ConnectionManager.releaseConnection(connection4);
        Connection connection7 = ConnectionManager.getConnection();
        Connection connection8 = ConnectionManager.getConnection();
        ConnectionManager.releaseConnection(connection1);
        ConnectionManager.releaseConnection(connection3);
        ConnectionManager.releaseConnection(connection5);
        ConnectionManager.releaseConnection(connection7);
        ConnectionManager.releaseConnection(connection8);
    }
}
