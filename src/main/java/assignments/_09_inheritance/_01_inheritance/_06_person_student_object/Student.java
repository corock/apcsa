package assignments._09_inheritance._01_inheritance._06_person_student_object;

public class Student extends Person {
    private int grade;
    private double gpa;

    public Student(String name, String birthday, int grade, double gpa) {
        super(name, birthday);
        this.grade = grade;
        this.gpa = gpa;
    }

    public int getGrade() {
        return grade;
    }

    public double getGpa() {
        return gpa;
    }
}
