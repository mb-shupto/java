package basic.java;

public class Car {
    String brand;
    int speed;

    //constructor
    Car(String b, int s){
        brand = b;
        speed = s;
    }

    // Method to display car info
    void showCarInfo(){
        System.out.println("Car brand: " + brand);
        System.out.println("Car speed: "+ speed + "km/h");
    }
}
