public class lab1 {
    public static void main(String [] args){
        int number = 31;
        int C2 = number%2; //1
        // C2 = 1 => O1 = -
        int C3 = number%3; //1
        int C5 = number%5; //1
        // C5 = 1 => O2 = /
        int C7 = number%7; //3
        // C7 = 3 => type long
        final int C = C3; //1
        //System.out.println("C2 = " + C2 + "\nC3 = " + C3 + "\nC5 = " + C5 + "\nC = " + C + "\nC7 = " + C7);

        int a = 4;
        int b = 5;
        int m = 10;
        int n = 15;

        float s = 0;

        if (n < a || m < b || a < 0 || b < 0 || n < 0 || m < 0) {
            System.out.println("S = " + s);
        } else if (a > -C || n < -C) {

            for (long i = (long) a; i <= (long)n; i++) {
                long num = i - C;
                for (long j = (long)b; j <= m; j++) {
                    s += (float) (i / j) / num;
                }
            }
            System.out.println("S = " + s);
        } else {
            System.out.println("Zero division!");
        }
    }
}