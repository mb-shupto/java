package abstraction;

//abstract class (we cannot create objects of this class)
abstract class Animal {
    // abstract method (Body must be implemented in subclasses)
    abstract void makeSound();

    //regular method (all animals can sleep the same way)
    void sleep(){
        System.out.println("The animal is sleeping...");
    }
}

class Dog extends Animal{
    @Override
    void makeSound() { //body is implemented in subclass
        System.out.println("Dog is barking!");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat is mewing!");
    }
}

class Cow extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cow is mowing");
    }
}

