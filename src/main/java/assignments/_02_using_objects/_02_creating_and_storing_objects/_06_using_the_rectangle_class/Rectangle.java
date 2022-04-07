package assignments._02_using_objects._02_creating_and_storing_objects._06_using_the_rectangle_class;

public class Rectangle {
    // Attributes
    private int width;
    private int height;

    // Constructor
    public Rectangle(int rectWidth, int rectHeight) {
        width = rectWidth;
        height = rectHeight;
    }

    // This method lets us print out the object
    // to see the values of the instance variables
    public String toString() {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
