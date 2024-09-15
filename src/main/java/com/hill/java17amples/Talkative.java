package com.hill.java17amples;

sealed public interface Talkative permits Person {

    // permits class should be final
    // and locate THIS package
    default void say() {
        System.out.println("Talkative.say()");
    }

    void sayAnother();
}
