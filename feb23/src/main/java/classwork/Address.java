package classwork;

public class Address {
    private String street, city, state, postalCode, country;

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public void validate() {
        System.out.println("Validating address: " + this);
    }

    public String outputAsLabel() {
        return street + ", " + city + ", " + state + " " + postalCode + ", " + country;
    }

    @Override
    public String toString() {
        return outputAsLabel();
    }
}
