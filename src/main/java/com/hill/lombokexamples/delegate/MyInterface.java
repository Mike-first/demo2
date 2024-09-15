package com.hill.lombokexamples.delegate;

public interface MyInterface {
    void method1();

    void method2();

    default void method3() {
        System.out.println("MyInterface.method3() called");
    }
}
