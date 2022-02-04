package assignments._01_primitive_types._03_expressions_and_assignment_statements._08_freely_falling_bodies;

public class FallingBodies {
    public static void main(String[] args) {
        final double g = 9.8;
        double t = 10;
        System.out.print("The height is " + (0.5 * g * t * t) + "\n");
        System.out.print("The velocity is " + (g * t));
    }
}
