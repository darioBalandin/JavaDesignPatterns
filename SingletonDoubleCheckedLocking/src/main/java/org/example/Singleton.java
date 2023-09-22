package org.example;

public class Singleton {

    private volatile static Singleton uniqueInstance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (uniqueInstance == null)
            // con syncronized, obligamos a cada hilo a esperar su turno para acceder al bloque si uniqueInst == null (solo la primera vez)
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        return uniqueInstance;
    }
}