package assignments._01_primitive_types._05_user_input._06_my_age_user_input;

import java.util.Scanner;

// Refer to your code from the previous My Age exercise.
// Modify it using the Scanner class to take user input instead of hard coding in your age.

public class MyAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your currenet age: ");
        int age = input.nextInt();
        System.out.println("My current age is: " + age);
        System.out.println("My age next year will be: " + (++age));
        System.out.print("My current age is: " + (--age));
    }
}
