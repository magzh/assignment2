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
        setName("DefaultName");
        setSurname("DefaultSurname");
        setGpa(0.0);
    }

    public Student(String name, String surname, double gpa){
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }

    @Override
    public String toString() {
        return "Student: " + getId() + ". " + getName() + '\'' + " " + getSurname();
    }
}
