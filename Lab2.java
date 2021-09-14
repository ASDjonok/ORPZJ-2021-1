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

        int elAmount = 0;
        for(int i = 0; i < b.length; i++){
            elAmount += 1;
        }
        System.out.println("Кількість елементів у стовпці: " + elAmount);

        //С11 = 9, тому потрібно знайти середнє значення елементів кожного стовпчика матриця
        float sumColumn1;
        for(int i = 0; i < b[0].length; i++){
            sumColumn1 = 0.0f;
            for(int j = 0; j < b.length; j++){
                sumColumn1 = sumColumn1 + b[j][i];
            }
            System.out.println("Сума значень " + i + " стовпця: " + sumColumn1);
            float result = sumColumn1/elAmount;
            System.out.println("Середнє значення серед " + i + " стовпця: " + result);
        }
    }
}


//        float sum1 = 0.0f;
//        float sum2 = 0.0f;

//        for(int i = 0; i < b.length; i++) {
//            sum1 += b[i][0] / (float)elAmount;
//            sum2 += b[i][1] / (float)elAmount;
//        }
//        System.out.println("Середнє значення серед першого стовця: " + sum1);
//        System.out.println("Середнє значення серед другого стовця: " + sum2);

