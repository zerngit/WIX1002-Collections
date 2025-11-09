
public class T4Q3 {

    public static void main(String[]args) {
        int fn1 = 1;
        int fn2 = 0;
        int fn = 0;
        int temp;
        System.out.print("0");

        for (int i = 0 ; i < 9 ; i++) {

            fn = fn1 + fn2;

            temp = fn1;
            
            fn1 = fn;
            
            fn2 = temp;

            System.out.print(", " +fn);
            
        }
    }
    
}
