package com.pluralsight;

import com.pluralsight.loops.Person;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
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
    }
}
