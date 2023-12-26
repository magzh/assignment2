import models.Employee;
import models.Person;
import models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Person> people = new ArrayList<>();

        ArrayList<Person> students = loadStudents();
        ArrayList<Person> employees = loadEmployees();

        people.addAll(students);
        people.addAll(employees);

        Collections.sort(people);
        printData(people);
    }

    public static ArrayList<Person> loadStudents() throws FileNotFoundException {
        File file = new File("C:\\Users\\magzh\\IdeaProjects\\assignment2\\src\\source\\students");
        Scanner scanner = new Scanner(file);
        ArrayList<Person> students = new ArrayList<>();
        while (scanner.hasNextLine()){
            students.add(new Student(scanner.next(), scanner.next(), scanner.nextDouble()));
        }
        return students;
    }

    public static ArrayList<Person> loadEmployees() throws FileNotFoundException {
        File file = new File("C:\\Users\\magzh\\IdeaProjects\\assignment2\\src\\source\\employees");
        Scanner scanner = new Scanner(file);
        ArrayList<Person> employees = new ArrayList<>();
        while (scanner.hasNextLine()){
            employees.add(new Employee(scanner.next(), scanner.next(), scanner.next(), scanner.nextDouble()));
        }
        return employees;
    }

    public static void printData(Iterable<Person> people){
        for(Person person : people){
            System.out.println(person.toString() + " earns " + String.format("%.2f",person.getPaymentAmount()) + " dollars");
        }
    }
}