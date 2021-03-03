package imperative;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Thiago", Gender.MALE),
                new Person("Arteta", Gender.MALE),
                new Person("Guardiola", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Debra", Gender.FEMALE));


        System.out.println("Imperative approach");
        Instant start = Instant.now();
        //Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.gender.equals(Gender.MALE)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }
        Instant finish = Instant.now();
        System.out.println("Execution: " + Duration.between(start, finish).toMillis());

        System.out.println("Declarative approach");
        start = Instant.now();
        //Declarative approach
        /*people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                //.collect(Collectors.toList())
                .forEach(System.out::println);*/

        //This is the equivalent of doing directly inside the filter
        Predicate<Person> femalePredicate = person -> person.gender.equals(Gender.MALE);

        people.stream()
                .filter(femalePredicate) //person -> person.gender.equals(Gender.MALE)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        finish = Instant.now();
        System.out.println("Execution: " + Duration.between(start, finish).toMillis());

    }


    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}
