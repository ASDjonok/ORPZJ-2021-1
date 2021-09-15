package ia91.gritsenko;

public class Lab2 {
    public static void main(String[] args) {

        //С7 = 6, тому потрібно використовувати тип даних float для елементів матриці.
        float[][] matrix = {{1.23f, 2.45f, 6.37f}, {3.56f, 9.12f, 4.98f}};
        float[][] b = new float[3][2];
        System.out.println("Початкова матриця matrix: ");

        //C5 = 1, тому потрібно транспонувати дану матрицю.
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " \t ");
            }
            System.out.println();
        }

        System.out.println("Транспонована матриця b: ");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                b[i][j] = matrix[j][i];
                System.out.print(b[i][j] + " \t ");
            }
            System.out.println();
        }

        System.out.println("------------------------------");

        //С11 = 9, тому потрібно знайти середнє значення елементів кожного стовпчика матриці.
        float sumColumn1;
        for(int i = 0; i < b[0].length; i++){
            sumColumn1 = 0.0f;
            for(int j = 0; j < b.length; j++){
                sumColumn1 = sumColumn1 + b[j][i];
            }
            System.out.println("Сума значень " + i + " стовпця: " + sumColumn1);
            float result = sumColumn1/b.length;
            System.out.println("Середнє значення серед " + i + " стовпця: " + result);
        }
    }
}
