package assignments._09_inheritance._06_polymorphism._09_fun_with_solids;

public class Solid {
    private String myName;

    public Solid(String name) {
        myName = name;
    }

    public String getName() {
        return myName;
    }

    // This should be overridden in the subclass
    public double volume() {
        return 0;
    }

    // This should be overridden in the subclass
    public double surfaceArea() {
        return 0;
    }
}
