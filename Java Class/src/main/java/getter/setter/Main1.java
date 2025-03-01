package getter.setter;

class Band {
    private String band;

    Band(String b) {
        band = b;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String newBand) {
        band = newBand;

    }

}

public class Main1 {
    public static void main(String[] args) {
        Band myBand= new Band("My Darkest Days");

        System.out.println("initially the band name was " + myBand.getBand());

        myBand.setBand("Never Say Die");

        System.out.println("later on we changed it to " + myBand.getBand());
    }
}

