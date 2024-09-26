package com.company;

public class Main {

    public static void main(String[] args) {
        //С7 = 1, тому потрібно використовувати тип даних byte для елементів матриці.
        //C5 = 3, C=A⊕B тому потрібно знайти пряму суму матриць.
        //С11 = 0, тому потрібно знайти суму найменших елементів кожного стовпчика матриці.

        byte[][] matrix1 = {{1, 1, 0, 1}, {0, 1, 1, 1}};
        byte[][] matrix2 = {{1, 0, 1}, {1, 0, 1}};
        byte[][] b = new byte[matrix1.length + matrix2.length][matrix1[0].length + matrix2[0].length];

        System.out.println("Перша матриця matrix1: ");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                System.out.print(matrix1[i][j] + " \t ");
            }
            System.out.println();
        }

        System.out.println("Друга матриця matrix1: ");
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2[i].length; j++){
                System.out.print(matrix2[i][j] + " \t ");
            }
            System.out.println();
        }

        System.out.println("------------------------------");
        System.out.println("Матриця результат прямої суми b: ");
        for(int i = 0; i < b.length; i++){
            if(i < matrix1.length ) {
                for (int j = 0; j < b[i].length; j++) {
                    if(j < matrix1[0].length) {
                        b[i][j] = matrix1[i][j];
                    }
                }
            }else{
                for (int j = 0; j < b[i].length; j++) {
                    if(j >= matrix1[0].length) {
                        b[i][j] = matrix2[i - matrix1.length][j - matrix1[0].length];
                    }else {
                        b[i][j] = 0;
                    }
                }
            }
        }
        //виводимо цю матрицю
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + " \t ");
            }
            System.out.println();
        }

        System.out.println("------------------------------");
        System.out.println("Сума нейменших елементів стовпців матриці b: ");
        float minSum = 0.0f;
        for(int i = 0; i < b[0].length; i++){
            float minElement = b[0][i];
            for(int j = 0; j < b.length; j++){
                if(b[j][i] < minElement){
                    minElement = b[j][i];
                }
            }
            minSum = minSum +minElement;
            System.out.println("Найменше значення " + i + " стовпця: " + minElement);
        }
        System.out.println("Сума найменших значеннь матриці: " + minSum);
        System.out.println("------------------------------");
    }
}

