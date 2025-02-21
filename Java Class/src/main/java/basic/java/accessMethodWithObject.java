//Create a Car object named myCar. Call the fullThrottle() and
// speed() methods on the myCar object and run the program.

package basic.java;

public class accessMethodWithObject {
    public void fullThrottle(){
        System.out.println("This car is going at full speed! ");
    }
    public void speed(int maxSpeed){
        System.out.println("The car is running at " + maxSpeed + " km/h speed!");
    }

    public static void main(String[] args) {
        accessMethodWithObject myCar = new accessMethodWithObject();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
