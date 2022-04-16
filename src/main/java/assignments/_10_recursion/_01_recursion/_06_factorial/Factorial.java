package assignments._10_recursion._01_recursion._06_factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        System.out.println(calcFactorial(number));
    }

    public static int calcFactorial(int x) {
        // // Write a base case
        // if (x <= 1) {
        //     return 1;
        // }
        // // Call the simplified solution
        // return x * calcFactorial(x - 1);

        return calcFactorialTail(x, 1);
    }

    private static int calcFactorialTail(int x, int result) {
        // Write a base case
        if (x <= 1) {
            return result;
        }

        // Call the simplified solution
        return calcFactorialTail(x - 1, x * result);
    }
}
