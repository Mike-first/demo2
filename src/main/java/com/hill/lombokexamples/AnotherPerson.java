package com.hill.lombokexamples;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor //not compatible with final fields
@Data //setters will not be available for final fields
public class AnotherPerson {
    private String firstName;
    private String lastName;
    private int age;
}
