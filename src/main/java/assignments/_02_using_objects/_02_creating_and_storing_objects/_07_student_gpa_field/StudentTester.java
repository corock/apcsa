package assignments._02_using_objects._02_creating_and_storing_objects._07_student_gpa_field;

public class StudentTester {
    public static void main(String[] args) {
        Student alan = new Student("Alan", "Turing", 11, 3.5);
        Student ada = new Student("Ada", "Lovelace", 12, 3.8);

        System.out.println(alan);
        System.out.println(ada);
    }
}
