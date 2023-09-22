package org.example;

public class Singleton {

    // inicializamos al cargar la clase, es seguro multihilo
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}