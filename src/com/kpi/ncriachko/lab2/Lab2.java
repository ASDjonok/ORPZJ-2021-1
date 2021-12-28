package com.kpi.ncriachko.lab2;

public class Lab2 {
    private static final int STUDENT_REPORT_CARD_NUMBER = 9212;

    /*
     *  C5 = A+B → Matrix.sum()
     *  C7 = double
     *  Обчислити суму найбільших елементів в рядках матриці з непарними → Matrix.sumOfTheBiggestOddRowElements()
     *  номерами та найменших елементів в рядках матриці з парними номерами → Matrix.sumOfTheLowestEvenRowElements()
     *
     * */

    public static void main(String[] args) {

        System.out.println("First sum test - " +
                (testAddOperation(new Matrix(2, 3).fillMatrix(new double[][]{{1, 2}, {2, 4}, {3, 2}}),
                        new Matrix(2, 3).fillMatrix(new double[][]{{5, 6}, {0, 0}, {5, 8}}),
                        new Matrix(2, 3).fillMatrix(new double[][]{{6, 7}, {2, 4}, {8, 10}})) ?
                        "success" : "fail"));

        System.out.println("Second sum test - " +
                (testAddOperation(new Matrix(2,2).fillMatrix(new double[][]{{1,2.5},{2,4}}),
                        new Matrix(4,3).fillMatrix(new double[][]{{5,6.6,2},{0,0,0},{5,8,1},{7,8,9}}),
                        new Matrix(4,3).fillMatrix(new double[][]{{6,9.1,2},{2,4,0},{5,8,1},{7,8,9}})) ?
                        "success" : "fail"));

        System.out.println("Third sum test - " +
                (testAddOperation(new Matrix(4,4).fillMatrix(new double[][]{{1.1,2.3,5.5,6},{2,4,0,4},{25,6,78,99},
                                {3.22, 1.85, 3.3, 55}}),
                        new Matrix(1,1).fillMatrix(new double[][]{{5.8}}),
                        new Matrix(4,4).fillMatrix(new double[][]{{6.9,2.3,5.5,6},{2,4,0,4},{25,6,78,99},
                                {3.22, 1.85, 3.3, 55}})) ?
                        "success" : "fail"));

        System.out.println();

        System.out.println("First sum of the lowest odd row elements test - " +
                ((testLowestEvenRowElemSum(new Matrix(3,4).fillMatrix(new double[][]{{-10,2,5,10},{22,35,2,4},
                        {112,32,66,78}}), 38)) ? "success" : "fail"));

        System.out.println("Second sum of the lowest odd row elements test - " +
                ((testLowestEvenRowElemSum(new Matrix(3,1).fillMatrix(new double[][]{{-555},{22},
                        {909}}), 0) ? "success" : "fail")));

        System.out.println("Third sum of the lowest odd row elements test - " +
                ((testLowestEvenRowElemSum(new Matrix(3,4).fillMatrix(new double[][]{{1,1,1,1},{2,2,2,2},
                        {3,3,3,3}}), 6)) ? "success" : "fail"));

        System.out.println();

        System.out.println("First sum of the biggest even row elements test - " +
                ((testBiggestOddRowElemSum(new Matrix(2,2).fillMatrix(new double[][]{{123,4},{88,77},}),
                        211)) ? "success" : "fail"));

        System.out.println("Second sum of the biggest even row elements test - " +
                ((testBiggestOddRowElemSum(new Matrix(3,1).fillMatrix(new double[][]{{25},{33},
                        {7}}), 65)) ? "success" : "fail"));

        System.out.println("Third sum of the biggest even row elements test - " +
                ((testBiggestOddRowElemSum(new Matrix(3,4).fillMatrix(new double[][]{{-10,2,5,10},{22,35,2,4},
                        {112,32,66,78}}), 139) ? "success" : "fail")));


    }

    /**
     * Test for the add operation of the Matrix
     * @param a First matrix operand
     * @param b Second matrix operand
     * @param expectedResult Expected result
     * @return True if the result equals expectedResult, otherwise returns false
     */
    private static boolean testAddOperation(Matrix a, Matrix b, Matrix expectedResult) {
        return expectedResult.equals(a.sum(b));
    }

    /**
     * Test for sumOfTheLowestEvenRowElements() method
     * @param a Matrix
     * @param expectedResult Expected result
     * @return True if the result equals expectedResult, otherwise returns false
     */
    private static boolean testLowestEvenRowElemSum(Matrix a, double expectedResult) {
        return a.sumOfTheLowestEvenRowElements() == expectedResult;
    }

    /**
     * Test for sumOfTheBiggestOddRowElements() method
     * @param a Matrix
     * @param expectedResult Expected result
     * @return True if the result equals expectedResult, otherwise returns false
     */
    private static boolean testBiggestOddRowElemSum(Matrix a, double expectedResult) {
        return a.sumOfTheBiggestOddRowElements() == expectedResult;
    }
}
