package com.hill.lombokexamples.delegate;

public class MyImplementation implements MyInterface {
    @Override
    public void method1() {
        System.out.println("MyImplementation.method1() called");
    }

    @Override
    public void method2() {
        System.out.println("MyImplementation.method2() called");
    }
}
