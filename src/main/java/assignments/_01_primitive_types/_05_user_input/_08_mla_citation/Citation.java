package assignments._01_primitive_types._05_user_input._08_mla_citation;

import java.util.Scanner;

public class Citation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the author's name as 'Last name, First name': ");
        String name = input.nextLine();

        System.out.println("Enter the title of the book: ");
        String title = input.nextLine();

        System.out.println("Enter the publisher of the book: ");
        String publisher = input.nextLine();

        System.out.println("Enter the year the book was published: ");
        String year = input.nextLine();

        System.out.println(name + ". " + title + ".");
        System.out.print(publisher + ", " + year + ".");
    }
}
