package basic.java;

public class Drive {
    public static void main(String[] args) {
        // creating an object of Car class inside Drive class
        Car car1 = new Car("Toyota", 100);
        Car car2 = new Car("BMW", 250);

        // calling the method to display car details
        car1.showCarInfo();
        car2.showCarInfo();
    }
}
