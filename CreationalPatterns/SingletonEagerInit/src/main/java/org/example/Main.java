package org.example;

public class Main {
    public static void main(String[] args) {


        Singleton s1 = Singleton.getInstance();

        System.out.println(s1);
        s1 = null;
        s1 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println("Hello world!");
    }
}