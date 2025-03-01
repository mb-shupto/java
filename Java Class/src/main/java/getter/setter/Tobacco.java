package getter.setter;


class Cigar{
    private int price;

    Cigar(int c){
        price = c;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class Tobacco {
    public static void main(String[] args) {
        Cigar cigar = new Cigar(12);
        //using getter
        System.out.println("When we first started smoking, Benson was "+cigar.getPrice()+" taka only!");

        cigar.setPrice(18);
        System.out.println("But, now it's " + cigar.getPrice() + " taka.");
    }
}
