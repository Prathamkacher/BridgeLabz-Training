package MultiLevelInheritance;

public class Student extends Person {

    String course;

    Student(String name, String course) {
        super(name);
        this.course = course;
    }
}
