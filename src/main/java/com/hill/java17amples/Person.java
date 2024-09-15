package com.hill.java17amples;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Builder
public final class Person implements Talkative {
    private final String firstName;
    private final String lastName;
    private int age;

    public static Person newPerson(@NonNull String name, String surname) {
        return new Person(name, surname, 0);
    }

    @Override
    public void sayAnother() {
        System.out.println("Person.sayAnother()");
    }


    //default method can be Override, but it's not strict
//    @Override
//    public void say() {
//        System.out.println("Person.say()");
//    }
}
