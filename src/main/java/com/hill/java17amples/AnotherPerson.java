package com.hill.java17amples;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

//'AnotherPerson' is not allowed in the sealed hierarchy
public class AnotherPerson /*implements Talkative*/ {
    private String firstName;
    private String lastName;
    private int age;
}
