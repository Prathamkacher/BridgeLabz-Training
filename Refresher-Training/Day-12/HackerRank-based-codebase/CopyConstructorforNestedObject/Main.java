package CopyConstructorforNestedObject;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("MP Nagar", "Bhopal", 462011);

        Student originalStudent = new Student("Rahul", address);
        Student copiedStudent = new Student(originalStudent);

        System.out.println("Before modification:");
        System.out.println("Original City: " + originalStudent.getAddress().getCity());
        System.out.println("Copied City: " + copiedStudent.getAddress().getCity());

        copiedStudent.getAddress().setCity("Indore");

        System.out.println("\nAfter modification:");
        System.out.println("Original City: " + originalStudent.getAddress().getCity());
        System.out.println("Copied City: " + copiedStudent.getAddress().getCity());

    }
}
