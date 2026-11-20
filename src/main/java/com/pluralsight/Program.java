package com.pluralsight;

import com.pluralsight.loops.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Lana", "Kendrick", 26));
        people.add(new Person("Mindy", "Jenkins", 55));
        people.add(new Person("William", "Harris", 38));
        people.add(new Person("Willy", "Wonka", 50));
        people.add(new Person("Sallie", "Mae", 22));
        people.add(new Person("Whitney", "Houston", 48));
        people.add(new Person("Richard", "Wilson", 79));
        people.add(new Person("Trafalgar", "Law", 26));
        people.add(new Person("Abigail", "Jones", 64));
        people.add(new Person("Tyrone", "Harris", 17));

        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        List<Person> matches = new ArrayList<>();

        for (Person person : people) {
            if(person.getFirstName().equalsIgnoreCase(name) || (person.getLastName().equalsIgnoreCase(name))) {
                matches.add(person);
            }
        }

        for (Person match : matches) {
            System.out.println(match);
        }
    }
}
