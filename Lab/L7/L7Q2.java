package L7;
import java.util.Scanner;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class L7Q2 {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            PrintWriter out = new PrintWriter(new FileOutputStream("L7/Lab07/index.html"));
            String line;
            while (in.hasNextLine()) {
                line = in.nextLine();
                out.println(line);
            }

            in.close();
            out.close();

        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
