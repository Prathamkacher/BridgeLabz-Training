public class Contact {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;

    public Contact(String firstName, String lastName, String phone, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getCity() {
        return address != null ? address.getCity() : "";
    }

    public String getState() {
        return address != null ? address.getState() : "";
    }

    public void updateDetails(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +
                "\nPhone: " + phone +
                "\nEmail: " + email +
                "\nAddress: " + (address != null ? address : "N/A") +
                "\n----------------------";
    }
}
