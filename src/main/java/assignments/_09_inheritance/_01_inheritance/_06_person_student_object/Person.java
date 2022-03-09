package assignments._09_inheritance._01_inheritance._06_person_student_object;

public class Person {
    private String name;
    private String birthday;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }
}
