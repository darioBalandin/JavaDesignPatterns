package org.example;

public class Main {
    public static void main(String[] args) {


        Singleton s1 = Singleton.getInstance();

        System.out.println(s1);
        s1 = null;
        s1 = Singleton.getInstance();

        System.out.println(s1);
//        if (s1.equals(s2)) {
//            System.out.println("Son la misma instancia");
//        } else {
//            System.out.println("Son diferentes");
//        }

    }
}