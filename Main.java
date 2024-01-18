package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import main.models.AbstractPerson;
import main.models.Employee;
import main.models.LowGpaException;
import main.models.Student;

public class Main {
    public static void main(String[] args) {
        Student n1 = new Student("Asan", "USenov", 2.71);
        Student n2 = new Student("Aisha", "Qunanbayeva", 3.66);
        Employee r1 = new Employee("Maqsat", "Toqtar", "Frontend", 900000);
        Employee r2 = new Employee("Arman", "Issayev", "Backend", 900000);
        ArrayList<AbstractPerson> people = new ArrayList<>();
        people.add(n1);
        people.add(n2);
        people.add(r1);
        people.add(r2);
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<AbstractPerson> people){
        for(AbstractPerson person: people){
            printPersonInfo(person);
        }
    }

    public static void printPersonInfo(AbstractPerson person){
        System.out.println(person.toString() + " earns " + person.getPaymentAmount());
    }
}