package getter.setter;

class Car {
    private String brand;  // Private variable (Encapsulation)

    // Constructor
    Car(String b) {
        brand = b;
    }

    // Getter (Read value)
    public String getBrand() {
        return brand;
    }

    // Setter (Modify value)
    public void setBrand(String newBrand) {
        brand = newBrand;
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");

        // Using Getter
        System.out.println("Initial Brand: " + myCar.getBrand());

        // Using Setter
        myCar.setBrand("Honda");
        System.out.println("Updated Brand: " + myCar.getBrand());
    }
}
