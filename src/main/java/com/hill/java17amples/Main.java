package com.hill.java17amples;


//import jdk.incubator.foreign.MemorySegment;
//import jdk.incubator.foreign.ResourceScope;
//import jdk.incubator.foreign.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob", "Chipeska", 40);
        person.say();
//=======================multi-line txt
        //multi-line string looks like Scala's one
        //tabs ignored, whitespaces included
        //should start from new line after """
        String newTextBlock = """
                   Hello,
                World!""";
        System.out.println(newTextBlock);

//=======================records
        //like Scala case-class
        record User(String name, int age) {
            //only private+static, otherwise compilation error
            private static int test;
            // non-private, but invisible from outside
            static int t2;

            private static void inc() {
                test++;
            }

            //methods are allowed like in simple class
            public void sayHello() {
                System.out.println("Record User.sayHello()");
                inc();
            }
        }

        User user = new User("John", 30);
        //toString() defined automatically in Records
        System.out.println(user.toString());
        //all fields of Record, defined as parameters os constructor, are public & final
//        user.age = 20;
        user.sayHello();


//=======================Pattern matching for instanceof
        Talkative tp = person;
        if (tp instanceof Person p) {
            p.say();
        }

//=======================Switch Expressions
        int number = (int) (Math.random() * 2 + 1);
        String output = switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            default -> "Unknown";
        };
        System.out.println(output); // Two


//=======================Unified Try-with-Resources
        Path filePath = Paths.get("src/main/resources/example.txt");
//        var - dynamic type definition
//        in Java 8 'var writer' should be declared as 'BufferedWriter writer'
        try (var writer = Files.newBufferedWriter(filePath)) {
            writer.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }


//=======================Foreign Memory Access API todo learn more
//        MemorySegment heapMemory = MemorySegment.allocateNative(1024, ResourceScope.newConfinedScope());
//        Arena globalArena = Arena.global();
//        MemorySegment segment = globalArena.allocate(100);
//        CData cdata = CData.ofAddress(heapMemory.address());
//        cdata.putInt(0, 42);
//        System.out.println(cdata.getInt(0)); // Prints: 42


//=======================Epsilon Garbage Collector
//        System.loadLibrary("my_native_library");
//        System.setProperty("jdk.internal.gc.epsilon", "true");
    }
}
