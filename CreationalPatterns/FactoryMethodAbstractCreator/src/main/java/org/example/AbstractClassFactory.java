package org.example;

public abstract class AbstractClassFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
}
