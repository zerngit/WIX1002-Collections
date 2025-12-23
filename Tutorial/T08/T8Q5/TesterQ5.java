package T08.T8Q5;

public class TesterQ5 {
    public static void main(String[] args) {
        Connection c1 = new Connection();
        Connection c2 = new Connection();
        c2.disconnect();
        c2.disconnect();
        Connection c3 = new Connection();
        Connection.displayTotalConnection();
    }
}
