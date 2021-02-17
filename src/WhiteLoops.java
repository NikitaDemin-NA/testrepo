

import com.sun.source.util.SourcePositions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Scanner;
/*
Положительное и отрицательное число
*/

public class WhiteLoops {
    public static void main(String[] args) {
        Person id1 = new Person();
        id1.name = "Коля";
        id1.age = 10;
        id1.say();
        id1.hello();
    }
}

class Person {
    String name;
    int age;

    void say() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " " + age);
        }
    }

    void hello() {
        System.out.println("hello");
    }
}




