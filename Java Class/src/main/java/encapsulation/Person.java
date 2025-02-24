package encapsulation;

public class Person {
    private String name; //restricted access. can't access it from outside this class

    //getter
    public String getName(){  //returns the value of the variable name
        return name;
    }
    //setter
    public void setName(String name1){   //takes a parameter (name1) and assigns it to the name variable
        this.name = name1; // this keyword is used to refer to the current object
    }
}
