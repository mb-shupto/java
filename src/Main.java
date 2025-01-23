// Define a class (blueprint)
class Car {
    // Data (attributes)
    String color;
    int speed;

    // Action (method)
    void drive() {
        System.out.println("The car is driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object (actual car)
        Car myCar = new Car();

        // Set the object's data
        myCar.color = "Red";
        myCar.speed = 120;

        // Use the object's method (action)
        System.out.println("Car color: " + myCar.color);
        System.out.println("Car speed: " + myCar.speed + " km/h");
        myCar.drive();
    }
}
