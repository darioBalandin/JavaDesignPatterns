package org.example;

public class Singleton {

    private static Singleton uniqueInstance = null;

    private Singleton() {
    }

    // con syncronized, obligamos a cada hilo a esperar su turno para acceder al metodo
    public static synchronized Singleton getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
