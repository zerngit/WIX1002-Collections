public class T5Q1 {
    public static void main(String[] args) {
        // Question a
        double [] arrayA = new double[12];

        // Question b
        char [] arrayB = {'A', 'B', 'C', 'D', 'E'};

        // Question c
        String [] arrayC = new String[100];

        // Question d
        int [][] arrayD = new int[6][2]; // 6 rows and 2 columns

        // Question e
        int [][] arrayE = {
            {6,9},
            {2,5},
            {4,6}
        };

        // Question f
        arrayE[1][1] = 4;
        arrayE[2][0] = 3;
        arrayE[2][1] = 7;

        // Question g
        for (int i = 0; i < arrayE.length ; i++) {
            for (int j = 0; j < arrayE[i].length ; j++) {
                System.out.print(arrayE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
