package com.company;

public class A {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        System.out.println("B, Introduce yourself first!");
        b.sayHello();

        System.out.println("your turn, C! introduce yourself.");
        c.sayHello();

        System.out.println("We are the one team now!!");
    }

    void sayHello() {
        System.out.println("Hello, I'm main program, A.");
    }
}
