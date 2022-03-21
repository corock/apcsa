package assignments._09_inheritance._06_polymorphism._09_fun_with_solids;

public class RectangularPrism extends Solid {
    private final int length;
    private final int width;
    private final int height;

    public RectangularPrism(String name, int length, int width, int height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double volume() {
        return width * length * height;
    }

    @Override
    public double surfaceArea() {
        return width * length * 2 + length * height * 2 + height * width * 2;
    }
}
