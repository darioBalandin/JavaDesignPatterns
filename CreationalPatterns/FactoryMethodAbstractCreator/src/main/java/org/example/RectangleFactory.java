package org.example;

public class RectangleFactory extends AbstractClassFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
