package ip94.dolgova.Lab4;

/**
 * Clothes class
 * 
 * @autor Yelyzaveta Dolhova
 * @version 1.1 7 Oct 2021
 */
public class Clothes {
    /**
     * Field - name
     */
    String name;
    /**
     * Field - color
     */
    String color;
    /**
     * Field - size
     */
    int size;
    /**
     * Field - length
     */
    int length;
    /**
     * Field - width
     */
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
    Clothes(String name, String color, int size, int length, int width) {
	this.name = name;
	this.color = color;
	this.size = size;
	this.length = length;
	this.width = width;
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
