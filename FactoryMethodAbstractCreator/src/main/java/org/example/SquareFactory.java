package org.example;

public class SquareFactory extends AbstractClassFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
