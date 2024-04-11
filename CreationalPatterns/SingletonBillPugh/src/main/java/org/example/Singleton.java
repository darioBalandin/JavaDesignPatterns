package org.example;

public class Singleton {


    private Singleton() {
    }

    private static class SingletonHelper {
        //Clase anidada es referenciada despues de llamar al metodo getInstance.
        private static final Singleton uniqueInstance = new Singleton();

    }

    public static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }
}