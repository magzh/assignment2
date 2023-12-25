package models;

public class Person implements Comparable<Person>, Payable{
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Person(){
        id = id_gen++;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getPaymentAmount() > o.getPaymentAmount())
            return 1;
        else if (this.getPaymentAmount() < o.getPaymentAmount())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return id + ". " + name + '\'' + " " + surname;
    }
}
