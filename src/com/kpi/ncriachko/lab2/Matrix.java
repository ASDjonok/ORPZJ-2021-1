package com.kpi.ncriachko.lab2;

import java.util.Scanner;



public class Matrix {

    // Matrix container
    private double[][] matrixContent;

    /**
     * Creates Matrix obj and fills matrix content with "1" value
     * @param rows Number of rows of the matrix
     * @param columns Number of columns of the matrix
     */
    public Matrix(int rows, int columns) {
        this.matrixContent = new double[rows][columns];
    }

    /**
     * Matrix sum method adds two matrix together.
     *
     * @param a Matrix to add
     * @return Resulting matrix
     */
    public Matrix sum(Matrix a) {
        double[][] firstMatrix = a.getMatrixContent();
        double[][] secondMatrix = this.getMatrixContent();
        // if matrix size of the second matrix is bigger, we extend first matrix to the size of the second
        if (a.getMatrixRows() > this.getMatrixRows() && a.getMatrixColumns() > this.getMatrixColumns()) {
            this.matrixContent = new double[a.getMatrixRows() + 1][a.getMatrixColumns() + 1];
            this.sum(new Matrix(this.getMatrixRows(),this.getMatrixColumns()).fillMatrix(secondMatrix));
            secondMatrix = this.getMatrixContent();
        }
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                this.setMatrixCell(firstMatrix[i][j] + secondMatrix[i][j], i, j);
            }
        }
        return this;
    }

    /**
     * Allows user to fill the matrix manually, during the runtime
     *
     * @return Filled matrix with user defined values
     */
    public Matrix fillMatrix() {
        Scanner console = new Scanner(System.in);
        for (int i = this.getMatrixRows(); i >= 0; i--) {
            for (int j = this.getMatrixColumns(); j >= 0; j--) {
                this.setMatrixCell(console.nextDouble(), i, j);
            }
        }
        return this;
    }

    /**
     * Automatically fills the matrix with the values in the array
     *
     * @param matrixContent Values to fill the matrix
     * @return Filled matrix with contents of the array in the params
     */
    public Matrix fillMatrix(double[][] matrixContent) {
        try {
            for (int i = matrixContent.length - 1; i >= 0; i--) {
                for (int j = matrixContent[i].length - 1; j >= 0; j--) {
                    this.setMatrixCell(matrixContent[i][j], i, j);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }
        return this;
    }

    /**
     * Finds the sum of the biggest elements in every odd row
     * @return Sum of the biggest elements in every odd row
     */
    public double sumOfTheBiggestOddRowElements() {
        double sum = 0;
        double num;
        double[][] matrixContent = this.getMatrixContent();
        for (int i = 0; i < matrixContent.length; i++) {
            num = matrixContent[i][1];
            for (int j = 3; j < matrixContent[i].length; j+=2) {
                if(num < matrixContent[i][j]) {
                    num = matrixContent[i][j];
                }
            }                                                               // so we check for even (0 → 1, 1 → 2 etc.)
            sum += num;
        }
        return sum;
    }

    /**
     * Finds the sum of the lowest elements in every even row
     * @return Sum of the lowest elements in every even row
     */
    public double sumOfTheLowestEvenRowElements() {
        double sum = 0;
        double[][] matrixContent = this.getMatrixContent();
        boolean foundEvenElement = false;
        for (int i = 0; i < matrixContent.length; i++) {
            double num = Double.MAX_VALUE;
            for (int j = 0; j < matrixContent[i].length; j++) {
                if (j % 2 != 0) {                               // cuz matrix rows begins from 1 not 0
                    num = Math.min(matrixContent[i][j], num);   // so we check for odd (0 → 1, 1 → 2 etc.)
                    foundEvenElement = true;
                }

            }
            sum += foundEvenElement ? num : 0;
        }
        return sum;
    }

    /**
     * Getter for matrix content
     * @return Matrix content
     */
    public double[][] getMatrixContent() {
        return matrixContent;
    }

    /**
     * Getter for matrix rows amount
     * @return Amount of matrix rows
     */
    public int getMatrixRows() {
        return getMatrixContent().length - 1;
    }

    /**
     * Getter for matrix columns amount
     * @return Amount of matrix columns
     */
    public int getMatrixColumns() {
        return getMatrixContent()[0].length - 1;
    }

    /**
     * Setter for matrix cell. Assign some value in param to the matrix element.
     * @param value Value to assign
     * @param row Row of the cell
     * @param cell Index of the cell
     */
    private void setMatrixCell(double value, int row, int cell) {
        this.matrixContent[row][cell] = value;
    }

    /**
     * Prints matrix
     */
    public void print() {
        for (int i = 0; i < matrixContent.length; i++) {
            for (int j = 0; j < matrixContent[i].length; j++) {
                System.out.print(this.matrixContent[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * Checks if these two matrix are equal (have same content)
     * @param a Second matrix
     * @return True if they equal, otherwise false.
     */
    public boolean equals(Matrix a) {
        boolean isEquals = true;
        double[][] first = a.getMatrixContent();
        double[][] second = this.getMatrixContent();
        if (first.length != second.length || first[0].length != second[0].length) {
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                if (first[i][j] != second[i][j]) {
                    isEquals = !isEquals;
                }
            }
        }
        return isEquals;
    }


}
