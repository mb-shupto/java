package encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(); //creating person object
        person.setName("John"); //setting John as name in the parameter
        System.out.println(person.getName());
        person.setAge(28); //setting 28 as age in the parameter
        System.out.println(person.getAge());
    }
}
