package imperative;

import java.util.ArrayList;
import java.util.List;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Lilly", FEMALE),
            new Person("Kitty", FEMALE),
            new Person("Denver", MALE)
        );

        List<Person> female = new ArrayList<>();

        for(Person person : people) {
            if(FEMALE.equals(person.gender)) {
                female.add(person);
                System.out.println(person);
            }
        }
    }

    static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
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
        FEMALE,
        MALE,
        UNDEFINED
    }
}
