package basic.java;

public class Main {
    static void myStaticMethod(){
        System.out.println("You just called a static method! ");
    }
    public void myPublicMethod(){
        System.out.println("Yup! You just called the public method!!");
    }

    public static void main(String[] args) {
        myStaticMethod();

        Main myObj = new Main();
        myObj.myPublicMethod();
    }
}