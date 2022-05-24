package assignments._02_using_objects._02_creating_and_storing_objects._08_instance_variables_for_your_dog;


public class Dog {
    private String breed;

    // Add an instance variable here for name.


    public Dog(String theBreed) {
        breed = theBreed;
    }

    // This method should work after you add the
    // new instance variable and update the constructor.
    // DO NOT modify this method.
    public String toString() {
        return name + " is a " + breed;
    }
}
