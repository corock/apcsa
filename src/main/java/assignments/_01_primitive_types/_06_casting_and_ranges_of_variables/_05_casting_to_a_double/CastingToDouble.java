package assignments._01_primitive_types._06_casting_and_ranges_of_variables._05_casting_to_a_double;

import java.util.Scanner;

public class CastingToDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int int1 = input.nextInt();
        int int2 = input.nextInt();

        double divide = (double) int1 / int2;
        System.out.print(divide);
    }
}
