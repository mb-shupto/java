package inheritance;

class Android {
    protected String brand = "mi";

    public void honk(){
        System.out.println("Just for fans!");
    }
}

class Car extends Android {
    private String modelName = "poco x2";

    public static void main(String[] args) {

        //create a myCar object
        Car myCar = new Car();

        myCar.honk();

        System.out.println(myCar.brand + ":"+ myCar.modelName);
    }
}