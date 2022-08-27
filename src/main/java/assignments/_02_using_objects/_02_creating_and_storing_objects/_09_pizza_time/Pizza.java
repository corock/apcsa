package assignments._02_using_objects._02_creating_and_storing_objects._09_pizza_time;

public class Pizza {

    // Add the instance variables here
    private String type;
    private String toppings;
    private int size;

    // Put the constructor here
    public Pizza(String pizzaType, String pizzaToppings, int pizzaSize) {
        type = pizzaType;
        toppings = pizzaToppings;
        size = pizzaSize;
    }

    // You don't need to do anything with this method
    // Used to print the object
    public String toString() {
        return size + " inch " + type + " pizza with " + toppings;
    }

}
