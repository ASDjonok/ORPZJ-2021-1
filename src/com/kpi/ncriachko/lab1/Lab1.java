package com.kpi.ncriachko.lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

// Count the sum of given formula depending on n and m
public class Lab1 {
    // Constants
    private static final int STUDENT_REPORT_CARD_NUMBER = 9212;
    /*
     *  С2 = '+'
     *  C5 = '%'
     *  C7 = byte
     * */
    private static final int myConst = STUDENT_REPORT_CARD_NUMBER % 3;  // ← C3


    public static void main(String[] args) throws Exception {
        // Input stream

        System.out.println("Enter loop variables - a,b,n,m:");
        System.out.println(countSum(readNum(), readNum(), readNum(), readNum()));


    }
    private static byte readNum() {
        byte flag = 0;
        byte num = 0;
        Scanner console = new Scanner(System.in);
        do{
            try{
                num = console.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Byte overflow");
                console.nextLine();
                flag = -1;
            }


        }while(flag == -1);
        return num;
    }

    /**
     * @param n number of iteration for first loop
     * @param m number of iteration for second loop
     * @return Summary of the formula given in the task.
     */
    private static double countSum( byte a, byte b,byte n, byte m) throws Exception {
        double sum = 0;
        if (b <=0 && m>=0 || a<=-myConst && n>=-myConst) {
            throw new Exception("Division by zero");
        }
        for (byte i = a; i <= n; i++) {
            for (byte j = b; j <= m; j++) {          // Start from 1, because of division by zero exception
                sum += (i % j) / (double) (i + myConst);
            }
        }
        return sum;
    }

}
