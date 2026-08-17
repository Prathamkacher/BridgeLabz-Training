package CopyConstructorforNestedObject;

public class Address {
    private String street;
    private String city;
    private int zipCode;

    public Address(String street, String city, int zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    //copy constructor
    public Address(Address other) {
        this.street = other.street;
        this.city = other.city;
        this.zipCode = other.zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getZipCode() {
        return zipCode;
    }
}
