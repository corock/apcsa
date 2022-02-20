package assignments._01_primitive_types._04_compound_assignment_operators._05_work_shift;

public class WorkShift {
    public static void main(String[] args) {
        int hours = 20;
        int minutes = 42;
        int seconds = 16;

        minutes += hours * 60;
        seconds += minutes * 60;
        System.out.println(seconds);
    }
}
