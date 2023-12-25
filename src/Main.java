import models.Person;
import models.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Student());
        printData(people);
    }

    public static void printData(Iterable<Person> people){
        
    }
}