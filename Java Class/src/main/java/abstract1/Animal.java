package abstract1;

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("Pig wiiii wiiiiiii");
    }
}
