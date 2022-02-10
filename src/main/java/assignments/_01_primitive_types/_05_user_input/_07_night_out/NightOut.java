package assignments._01_primitive_types._05_user_input._07_night_out;

import java.util.*;

public class NightOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much did dinner cost?");
        double dinner = input.nextDouble();

        System.out.println("How much is mini - golf for one person?");
        double golf = input.nextDouble();

        System.out.println("How much did dessert cost?");
        double desert = input.nextDouble();

        double total = dinner + (2 * golf) + desert;

        System.out.println("Dinner: $" + dinner);
        System.out.println("Mini-Golf: $" + golf);
        System.out.println("Dessert: $" + desert);
        System.out.println("Grand Total: $" + total);
    }
}
