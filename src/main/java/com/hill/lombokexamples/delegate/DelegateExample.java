package com.hill.lombokexamples.delegate;

import lombok.Delegate;

public class DelegateExample {
    @Delegate
    private MyInterface delegateObject;

    public DelegateExample(MyInterface delegateObject) {
        this.delegateObject = delegateObject;
    }

    //@Delegate annotation replaces two following methods:
//    public void method1() {
//        delegateObject.method1();
//    }
//
//    public void method2() {
//        delegateObject.method2();
//    }
}




