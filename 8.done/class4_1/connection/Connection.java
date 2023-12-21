package connection;

public class Connection {
    private static int connectionCounter = 0;
    private int connectionId;
    public Connection() {
        connectionCounter++;
        connectionId = connectionCounter;
    }
    public int getConnectionId() {
        return connectionId;
    }
    public void closeConnection() {
        System.out.println("Connection " + connectionId + " zach");
        connectionCounter--;
    }
}
