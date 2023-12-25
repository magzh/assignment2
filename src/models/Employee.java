package models;

public class Employee extends Person{
    private String position;
    private double salary;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(){
        setName("DefaultName");
        setSurname("DefaultSurname");
        setPosition("DefaultPosition");
        setSalary(0.0);
    }

    public Employee(String name, String surname, String position, double salary){
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public int compareTo(Person o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return "Employee: " + getId() + ". " + getName() + '\'' + " " + getSurname();
    }
}
