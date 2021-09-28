package ip94.dolgova.Lab4;

import java.util.*;

public class Lab4 {

    public static void main(String[] args) {
	Clothes shirt = new Clothes("shirt", "white", 42, 60, 42);
	Clothes jeans = new Clothes("jeans", "blue", 48, 72, 57);
	Clothes jacket = new Clothes("jacket", "black", 46, 45, 60);
	Clothes dress = new Clothes("dress", "red", 38, 50, 65);

	Clothes[] clothes = new Clothes[] { shirt, jeans, jacket, dress };

	System.out.println("Initial array");
	printArray(clothes);

	Arrays.sort(clothes, new Comparator<Clothes>() {
	    public int compare(Clothes o1, Clothes o2) {
		return o1.name.compareTo(o2.getName());
	    }
	});

	System.out.println();
	System.out.println("Sorting by name");
	printArray(clothes);

	Arrays.sort(clothes, Collections.reverseOrder(new Comparator<Clothes>() {
	    public int compare(Clothes o1, Clothes o2) {
		return ((Integer) o1.length).compareTo(o2.getLength());
	    }
	}));

	System.out.println();
	System.out.println("Sorting by length in a reverse order");
	printArray(clothes);
    }

    private static void printArray(Clothes[] array) {
	for (int i = 0; i < array.length; i++) {
	    System.out.println(array[i]);
	}
    }
}
