package com.hill.springexample;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SomeService.class, AnotherService.class);
        context.refresh();
        //or
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SomeService someService = context.getBean(SomeService.class);
        someService.method();
        context.close();
    }
}
