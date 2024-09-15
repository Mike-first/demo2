package com.hill.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeService {
    @Autowired
    private AnotherService anotherService;

    public void method() {
        anotherService.doSomething();
        System.out.println("and do something else");
    }
}
