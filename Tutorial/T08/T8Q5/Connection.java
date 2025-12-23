package T08.T8Q5;

public class Connection {
    private static int totalCon = 0;
    private boolean connected = true;

    public Connection() {
        this.totalCon += 1;
    }

    public void disconnect() {
        if (connected) {
            connected = false;
            totalCon -= 1;
        }
    }
    
    public static void displayTotalConnection() {
        System.out.println("Total Connections: " + totalCon);
    }

}
