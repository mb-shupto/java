package polymorphism;

public class Instrument
{
    void play(){
        System.out.println("Instrument is playing!");
    }
}
class Guitar extends Instrument{
    @Override
    void play() {
        System.out.println("The guitar string is playing! ");
    }
}
class Piano extends Instrument{
    @Override
    void play() {
        System.out.println("The piano key is playing");
    }
}
class Drum extends Instrument{
    @Override
    void play(){
        System.out.println("The drum pad is playing");
    }
}

