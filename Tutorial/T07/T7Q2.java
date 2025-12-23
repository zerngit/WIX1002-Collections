package T07;

public class T7Q2 {
    /*
    a)

     */

    /*
    b)
    try {
        PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
        out.close();
    } catch (IOException e) {
        System.out.println("Problem with file output");}
     */

    /*
    c)
    int num;
    ObjectInputStream a = new ObjectInputStrea(new FileInputStream("data.dat"));
    num = a.readInt();
    a.close();
     */

    /*
    d) 
    ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("data.dat"))
    o.writeUTF('A');
    o.close();
     */

}

