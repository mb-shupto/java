package classwork;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("123 Main St", "Springfield", "IL", "62704", "USA");


        Student student = new Student("Alice", "123-456-7890", "alice@example.com", address, "S12345", 85.5);


        Professor professor = new Professor("Dr. Smith", "987-654-3210", "drsmith@example.com", address, 75000);


        System.out.println(student);
        System.out.println(professor);


        System.out.println(student.getName() + " is eligible to enroll: " + student.isEligibleToEnroll());

        student.purchaseParkingPass();
        professor.purchaseParkingPass();
    }
}
