import java.util.Random;

public class lab2 {
    public static void main(String [] args){
    /*
    C5 = 1 C7 = 3 C11 = 9 C = Bt type int
    Знайти середнє значення елементів кожного стовпчика матриці
     */
        try {
            int m = 2;
            int n = 4;
            int B[][] = new int[m][n];
            int C[][] = new int[n][m];
            float average[][] = new float[1][m];

            for (int i = 0; i < average.length; i++) {
                for (int j = 0; j < 1; j++) {
                    average[i][j] = 0;
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    B[i][j] = (int) (Math.random() * 100);
                }
            }
            System.out.println("Matrix B:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Matrix C = Bt:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    C[i][j] = B[j][i];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Average values of columns:");

            for (int i = 0; i < m; i++) {
                float sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += (double) C[j][i] / n;
                    average[0][i] = sum;
                }
                // System.out.println(sum);
            }

            for (int i = 0; i < average.length; i++) {
                for (int j = 0; j < average[i].length; j++) {
                    System.out.print(average[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch(Exception error){
            System.out.println("You enter incorrect data!");
        }


    }
}