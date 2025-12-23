public class T6Q2 {
    public static void td(int a, int b , int c) {
        int n1,n2,n3;
        int list[] = {a,b,c};
        for (int i = 0 ; i < list.length ; i++) {
            for (int j = 0 ; j < list.length - 1  ; j++) {
                if (list[j] < list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        for (int k = 0 ; k < list.length ; k++) {
            System.out.println(list[k]);
        }
    }

    public static void main(String[] args) {
        td(3,1,2);
    }
}
