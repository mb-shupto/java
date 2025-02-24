package classwork;

public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;


    public Person (String name,String number, String emailAddress,Address address){
        this.name = name;
        this.address=address;
        this.emailAddress=emailAddress;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public void purchaseParkingPass() {
        System.out.println(name + " has purchased a parking pass.");
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', phoneNumber='" + phoneNumber + "', emailAddress='" + emailAddress + "', address=" + address + "}";
    }
}


