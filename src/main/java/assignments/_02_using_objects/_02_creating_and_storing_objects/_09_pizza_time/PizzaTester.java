package assignments._02_using_objects._02_creating_and_storing_objects._09_pizza_time;

public class PizzaTester {

    public static void main(String[] args) {
        // Test your Pizza class here.
        Pizza pineapple = new Pizza("pineapple", "pineapple and ham", 12);
        System.out.println(pineapple);

        Pizza kiwi = new Pizza("kiwi", "kiwi and sausage", 12);
        System.out.println(kiwi);

        Pizza apple = new Pizza("apple", "apple and chocolate", 12);
        System.out.println(apple);
    }

}
