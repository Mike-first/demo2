package com.hill.lombokexamples.delegate;

public class MainDelegate {
    public static void main(String[] args) {
        MyInterface delegateObject = new MyImplementation();
        DelegateExample example = new DelegateExample(delegateObject);
        //@Delegate
        example.method1();
        example.method2();
        example.method3();
    }
}
