package inheritance;

public class Main {
    int x;

    public Main(int x) {
        this.x = 7;
    }

    public static void main(String[] args) {
        Main myObj = new Main(8);
        System.out.println(myObj.x);
    }
}
