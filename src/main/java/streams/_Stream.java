package streams;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Thiago", Gender.MALE),
                new Person("Arteta", Gender.MALE),
                new Person("Guardiola", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Debra", Gender.FEMALE));


//        people.stream()
//                .map(person -> person.gender)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
//
//        people.stream()
//                .filter(person -> person.gender == Gender.MALE)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//
//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        System.out.println(people.stream()
                //.filter(person -> person.gender == Gender.FEMALE)
                .anyMatch(person -> person.gender == Gender.FEMALE));

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
