package assignments._01_primitive_types._06_casting_and_ranges_of_variables._04_casting_to_an_int;

import java.util.Scanner;

public class CastingToInt {
    public static void main(String[] args) {
        // Start here!
        Scanner input = new Scanner(System.in);
        double myDouble = input.nextDouble();
        int myInt = (int) myDouble;
        System.out.print(myInt);
    }
}
