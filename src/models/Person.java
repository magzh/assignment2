package models;

public class Person implements Comparable<Person> {
    private int id;
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
        setName("DefaultName");
        setSurname("DefaultSurname");
    }
    public Person(String name, String surname){
        setName(name);
        setSurname(surname);
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public String toString() {
        return id + ". " + name + '\'' + " " + surname;
    }
}
