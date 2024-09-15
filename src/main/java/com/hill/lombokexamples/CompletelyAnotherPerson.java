package com.hill.lombokexamples;

import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
public class CompletelyAnotherPerson {
    @Singular("String") //todo how it should works??
    private List<String> hobbies;
    private String firstName;
    private String lastName;
    private int age;
}
