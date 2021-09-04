package ip94.dolgova;

public class Lab1 {

    public static void main(String[] args) {

	// Boundaries of the sum
	int a = 2;
	int b = -5;
	int m = 10;
	int n = 15;

	// Constant found by dividing the variant number
	final int C = 9410 % 3;

	// Result
	float s = 0;

	if (n < a || m < b) {
	    System.out.println("S = " + s);
	} else if (a > -C || n < -C) {

	    for (int i = a; i <= n; i++) {
		int signifier = i + C;
		for (int j = b; j <= m; j++) {
		    s += (float) (i * j) / signifier;
		}
	    }
	    System.out.println("S = " + s);
	} else {
	    System.out.println("Error. Zero division is not allowed");
	}
    }
}
