package ip94.dolgova.Lab4;

public class Clothes {
    String name;
    String color;
    int size;
    int length;
    int width;

    Clothes(String n, String c, int s, int l, int w) {
	name = n;
	color = c;
	size = s;
	length = l;
	width = w;
    }

    public String toString() {
	return "Name: " + name + ", color: " + color + ", size: " + size + ", length: " + length + ", width: " + width;
    }

    String getName() {
	return name;
    }

    int getLength() {
	return length;
    }

}
