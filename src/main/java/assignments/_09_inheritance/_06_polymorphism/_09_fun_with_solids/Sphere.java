package assignments._09_inheritance._06_polymorphism._09_fun_with_solids;

import java.lang.Math;

public class Sphere extends Solid {
    private final int radius;

    public Sphere(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4.0 / 3 * Math.PI * (Math.pow(radius, 3));
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * (Math.pow(radius, 2));
    }
}
