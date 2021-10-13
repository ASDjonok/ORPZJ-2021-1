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
    private String name;
    /**
     * Field - color
     */
    private String color;
    /**
     * Field - size
     */
    private int size;
    /**
     * Field - length
     */
    private int length;
    /**
     * Field - width
     */
    private int width;

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
	setName(name);
	setColor(color);
	setSize(size);
	setLength(length);
	setWidth(width);
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
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

    /**
     * Getting the length value
     */
    public int getLength() {
	return length;
    }

    public void setLength(int length) {
	this.length = length;
    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

    public int getWidth() {
	return size;
    }

    public void setWidth(int width) {
	this.width = width;
    }

}
