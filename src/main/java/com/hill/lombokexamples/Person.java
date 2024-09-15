package com.hill.lombokexamples;

import com.hill.java17amples.Talkative;
import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Builder
public class Person {
    private final String firstName;
    private final String lastName;
    private int age;

    public static Person newPerson(@NonNull String name, String surname) {
        return new Person(name, surname, 0);
    }

}
