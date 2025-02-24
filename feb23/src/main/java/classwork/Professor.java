package classwork;

public class Professor extends Person {
    private double salary;

    public Professor(String name, String phoneNumber, String emailAddress, Address address, double salary) {
        super(name, phoneNumber, emailAddress, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + ", salary=" + salary + "}";
    }
}
