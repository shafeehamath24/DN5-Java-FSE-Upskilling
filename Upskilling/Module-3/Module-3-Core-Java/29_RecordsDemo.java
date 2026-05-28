/* 29. Records
• Objective: Use the record keyword for immutable data structures (Java 16+).
• Task: Create a record to represent a Person with name and age.
• Instructions:
o Define a record named Person.
o Create instances and print them.
o Use records in a List and filter based on age using Streams. */

import java.util.List;

record Person(String name, int age) {
}

class RecordsDemo {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Shafee", 20),
                new Person("Arun", 17),
                new Person("Vijay", 25));

        System.out.println("People aged 18 and above:");

        people.stream()
                .filter(person -> person.age() >= 18)
                .forEach(System.out::println);
    }
}