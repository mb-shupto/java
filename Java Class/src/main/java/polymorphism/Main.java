package polymorphism;

public class Main{
    public static void main(String[] args) {
       //crating objects using parent class reference (polymorphism)
       Instrument myInstrument;

       myInstrument = new Guitar();
       myInstrument.play();

       myInstrument = new Piano();
       myInstrument.play();
    }
}
