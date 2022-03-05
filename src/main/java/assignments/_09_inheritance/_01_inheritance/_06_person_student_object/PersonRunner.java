package assignments._09_inheritance._01_inheritance._06_person_student_object;

public class PersonRunner {
    public static void main(String[] args) {
        Person edison = new Person("Thomas Edison", "February 11, 1847");
        Student einstein = new Student("Albert Einstein", "March 14, 1879", 12, 5.0);

        System.out.println(edison.getName());
        System.out.println(edison.getBirthday());
        System.out.println(einstein.getGrade());
        System.out.println(einstein.getGpa());

        System.out.println(einstein.getName());
        System.out.println(einstein.getBirthday());
    }
}
