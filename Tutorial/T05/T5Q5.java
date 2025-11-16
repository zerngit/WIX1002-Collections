public class T5Q5 {
    public static void main(String[] args) {
        //String [] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        for (int i = array.length -1 ; i >= 0 ; i--) {
            for (int j = array[i].length()-1 ; j >= 0 ; j--) {
                System.out.print(array[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
