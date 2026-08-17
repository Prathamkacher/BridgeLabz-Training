package EmployeeIDGenerator;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pratham");
        Employee e2 = new Employee("Krishna");
        Employee e3 = new Employee("Deepanshu");
        Employee e4 = new Employee("Shivam");

        System.out.println(e1.getName() + " -> " + e1.getEmployeeId());
        System.out.println(e2.getName() + " -> " + e2.getEmployeeId());
        System.out.println(e3.getName() + " -> " + e3.getEmployeeId());
        System.out.println(e4.getName() + " -> " + e4.getEmployeeId());
    }
}
