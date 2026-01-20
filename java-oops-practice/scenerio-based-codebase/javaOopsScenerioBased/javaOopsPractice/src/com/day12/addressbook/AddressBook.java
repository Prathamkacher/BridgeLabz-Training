import java.util.*;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add contact (prevent duplicate by first name)
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("Duplicate contact not allowed!");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Edit contact
    public void editContact(String name, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                c.updateDetails(newPhone, newEmail);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete contact
    public void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            if (it.next().getFirstName().equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Search by city
    public void searchByCity(String city) {
        System.out.println("Contacts in city: " + city);
        for (Contact c : contacts) {
            if (c.getCity().equalsIgnoreCase(city)) {
                System.out.println(c);
            }
        }
    }

    // Search by state
    public void searchByState(String state) {
        System.out.println("Contacts in state: " + state);
        for (Contact c : contacts) {
            if (c.getState().equalsIgnoreCase(state)) {
                System.out.println(c);
            }
        }
    }

    // Display all sorted
    public void displayAll() {
        contacts.sort(Comparator.comparing(Contact::getFirstName));

        System.out.println("\nAll Contacts (Sorted):");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
