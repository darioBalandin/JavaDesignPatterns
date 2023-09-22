package org.example;

public class CircleFactory extends AbstractClassFactory{
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
