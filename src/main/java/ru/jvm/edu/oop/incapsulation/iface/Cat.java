package ru.jvm.edu.oop.incapsulation.iface;

public class Cat implements Animal {

    @Override
    public void say() {
        System.out.println("Mew!");
    }
}
