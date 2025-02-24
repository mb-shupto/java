package inheritance;

class Vehicles {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Honk honk!");
    }
}

class Car extends Vehicles {
    private String modelName = "Mustang";

    public static void main(String[] args) {

        //create a myCar object
        Car myCar = new Car();

        myCar.honk();

        System.out.println(myCar.brand + ":"+ myCar.modelName);
    }
}