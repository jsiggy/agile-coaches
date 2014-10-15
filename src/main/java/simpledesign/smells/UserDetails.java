package simpledesign.smells;

public class UserDetails {
    static long IDs = 0;

    long id;

    boolean hasErrors;

    String a;  // first name
    String b;  // last name

    // Address
    String street;
    String city;
    int zip;

    public UserDetails(String first, String last) {
        id = UserDetails.IDs++;
        a = first;
        b = last;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return a;
    }

    public void setFirstName(String firstName) {
        this.a = firstName;
    }

    public String getLastname() {
        return b;
    }

    public void setLastname(String lastname) {
        this.b = lastname;
    }

    public String getAddress() {
        return street + city + zip;
    }

    public void setAddress(String street, String city, int zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public boolean hasErrors() {
        return hasErrors;
    }
}
