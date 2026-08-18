package MultiLevelInheritance;

public class GraduateStudent extends Student {

    String thesisTitle;

    GraduateStudent(String name, String course, String thesisTitle) {
        super(name, course);
        this.thesisTitle = thesisTitle;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Thesis: " + thesisTitle);
    }
}
