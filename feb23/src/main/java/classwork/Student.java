package classwork;
public class Student extends Person {
    private String studentNumber;
    private double averageMark;

    public Student(String name, String phoneNumber, String emailAddress, Address address, String studentNumber, double averageMark) {
        super(name, phoneNumber, emailAddress, address);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnroll() {
        return averageMark >= 50;
    }

    public void getSeminarsTaken() {
        System.out.println(getName() + " has taken multiple seminars.");
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + ", studentNumber='" + studentNumber + "', averageMark=" + averageMark + "}";
    }
}
