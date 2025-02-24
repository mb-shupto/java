package abstraction;

public class Main {
    public static void main(String[] args) {

        Animal myAnimal;
        myAnimal = new Dog();
        myAnimal.makeSound();
        myAnimal.sleep();

        myAnimal = new Cat();
        myAnimal.makeSound();

        myAnimal = new Cow();
        myAnimal.makeSound();
    }
}
