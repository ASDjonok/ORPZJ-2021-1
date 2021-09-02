package ip94.dolgova;

public class Lab1 {

    public static void main(String[] args) {

	// Boundaries of the sum
	int a = 2;
	int b = -5;
	int m = 10;
	int n = 10;

	// Constant found by dividing the variant number
	final int C = 2;

	// Result
	double s = 0;

	label: for (int i = a; i <= n; i++) {
	    int signifier = i + C;

	    // Checking for errors
	    if (signifier == 0) {
		System.out.println("Error. Zero division is not allowed");
		break label;
	    } else {
		for (int j = b; j <= m; j++) {
		    s += (float) (i * j) / signifier;
		}
	    }

	}

	System.out.println("S = " + s);
    }

}
