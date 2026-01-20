import java.util.*;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City");
            System.out.println("5. Search by State");
            System.out.println("6. Display All");
            System.out.println("7. Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("First Name: ");
                    String fn = sc.nextLine();
                    System.out.print("Last Name: ");
                    String ln = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("City: ");
                    String city = sc.nextLine();
                    System.out.print("State: ");
                    String state = sc.nextLine();
                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    Address addr = new Address(city, state, zip);
                    Contact contact = new Contact(fn, ln, phone, email, addr);
                    book.addContact(contact);
                    break;

                case 2:
                    System.out.print("Enter name to edit: ");
                    String editName = sc.nextLine();
                    System.out.print("New Phone: ");
                    String newPhone = sc.nextLine();
                    System.out.print("New Email: ");
                    String newEmail = sc.nextLine();
                    book.editContact(editName, newPhone, newEmail);
                    break;

                case 3:
                    System.out.print("Enter name to delete: ");
                    book.deleteContact(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter city: ");
                    book.searchByCity(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Enter state: ");
                    book.searchByState(sc.nextLine());
                    break;

                case 6:
                    book.displayAll();
                    break;

                case 7:
                    System.out.println("Thank you!");
                    return;
            }
        }
    }
}
