package backend;

import entity.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise02 {
    public static void question01(){
        Person p1 = new Person(1,"Person1", LocalDate.of(2002,3,12),6.5);
        Person p2 = new Person(2,"Person2", LocalDate.of(2003,4,12),6.5);
        Person p3 = new Person(3,"Person3", LocalDate.of(2004,2,12),6.5);
        Person p4 = new Person(4,"Person4", LocalDate.of(2005,1,12),6.5);
        Person p5 = new Person(5,"Person5", LocalDate.of(2005,1,12),6.5);
        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p3);
        people.add(p2);
        people.add(p5);
        people.add(p4);
        for (Person person : people) {
            System.out.println("person = " + person);
        }
        Collections.sort(people);
        for (Person person : people) {
            System.out.println("person = " + person);
        }
    }
}
