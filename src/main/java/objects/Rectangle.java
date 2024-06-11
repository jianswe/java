package objects;

/**
 * Encapsulation
 * All data and behavior is contained within the object itself.
 * Expose behavior and restrict direct access to data.
 * */

public class Rectangle {

    private double length;
    private double width;
    private final int sides = 4;

    // Default Constructor: all non-static classes have a default constructor
    public Rectangle() {
        setLength(0);
        setWidth(0);
    }

    // All args Constructor
    public Rectangle (double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
