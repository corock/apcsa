package assignments._09_inheritance._06_polymorphism._09_fun_with_solids;

import java.lang.Math;

public class Cylinder extends Solid {
    private final int radius;
    private final int height;

    public Cylinder(String name, int radius, int height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }
}
