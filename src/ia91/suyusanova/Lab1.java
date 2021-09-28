package ia91.suyusanova;

public class Lab1 {

    public static void main(String[] args) {
        int zalicova = 9126;

        int x = zalicova % 2; //0
        int y = zalicova % 3; //0
        int z = zalicova % 5; //1
        int q = zalicova % 7; //5

        System.out.println("С2 = " + x);
        System.out.println("С3 = " + y);
        System.out.println("С5 = " + z);
        System.out.println("С7 = " + q);

        int a = 6;
        int b = 3;
        int m = 10;
        int n = 10;

        final int C = y;

        float sum = 0;

        if (n<a || m<b) {
            System.out.println("Sum = " + sum);
        }
        else if ((a>-C || n<-C) && (b>0 || m<0)) {
            for (float i = a; i <= n; i++) {
                float num = i + C;
                for (float j = b; j <= m; j++) {
                    sum += (i/j) / num;
                }
            }
            System.out.println("Sum = " + sum);;
        }
        else {
            System.out.println("Division by zero...");
        }
    }
}
