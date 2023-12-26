package models;

public class Student extends Person {
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student(){
        super();
    }

    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }

    @Override
    public double getPaymentAmount() {
        return getGpa() > 2.67 ? 36660.0 : 0.0;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
