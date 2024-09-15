package com.hill.lombokexamples;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //@AllArgsConstructor
        Person person = new Person("Bob", "Chipeska", 40);
        //@Getter
        System.out.println(person.getAge());

        //@Builder
        Person p2 = Person.builder().age(36).firstName("Bob").lastName("Marley").build();
        //@Setter
        p2.setAge(37);

        //@ToString
        System.out.println(p2);

        //@RequiredArgsConstructor
        Person p3 = new Person("John", "Doe");

        Person p4 = Person.newPerson("John", null);
//        Person p5 = Person.newPerson(null, null); //NullPointerException due to @NonNull String name
        System.out.println("\n\n============p4");
        System.out.println(p4);

        //@NoArgsConstructor
        AnotherPerson ap = new AnotherPerson();
        //@Data
        System.out.println(ap.getAge());
        ap.setAge(30);
        System.out.println("\n\n============cap");
        CompletelyAnotherPerson cap = new CompletelyAnotherPerson();
        cap.setHobbies(Arrays.asList("one", "two", "three", "two"));
        cap.getHobbies().forEach(System.out::println);

    }
}