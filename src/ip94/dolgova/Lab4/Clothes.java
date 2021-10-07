package ip94.dolgova.Lab4;

/**
 * Clothes class
 * 
 * @autor Yelyzaveta Dolhova
 * @version 1.0
 */
public class Clothes {
    String name;
    String color;
    int size;
    int length;
    int width;

    /**
     * Constructor - creating a new object with certain parameters
     *
     * @param n name
     * @param c color
     * @param s size
     * @param l length
     * @param w width
     */
    Clothes(String n, String c, int s, int l, int w) {
	name = n;
	color = c;
	size = s;
	length = l;
	width = w;
    }

    /**
     * String representation of an object
     */
    public String toString() {
	return "Name: " + name + ", color: " + color + ", size: " + size + ", length: " + length + ", width: " + width;
    }

    /**
     * Getting the name value
     */
    String getName() {
	return name;
    }

    /**
     * Getting the length value
     */
    int getLength() {
	return length;
    }

}
