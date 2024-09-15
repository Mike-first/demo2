package com.hill.springexample;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class AnotherService {

    @PostConstruct
    public void init() {
        System.out.println("Initializing AnotherService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying AnotherService");
    }

    public void doSomething() {
        System.out.println("Do something in AnotherService");
    }
}
