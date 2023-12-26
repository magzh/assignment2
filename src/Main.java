import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Student("Curtis","Joseph",2.68));
        people.add(new Employee("Pavel","Datsyuk","Centre",45000.0));
        people.add(new Student("Manny","Legace",2.67));
        people.add(new Employee("Brett","Hull","Right Wing",25000.0));
        people.add(new Employee("Brendan","Shanahan","Left Wing",36000.0));
        people.add(new Employee("Mathieu","Schneider","Defender",36670.0));
        people.add(new Student("Dominik","Hasek",4.00));
        people.add(new Employee("Nicklas","Lidstorm","Defender",41000.0));
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people){
        for(Person person : people){
            System.out.println(person.toString() + " earns " + String.format("%.2f",person.getPaymentAmount()) + " dollars");
        }
    }
}