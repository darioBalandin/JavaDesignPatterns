package org.example;

public interface Duck {
    void quack();

    void fly();
}

class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack from mallard");
    }

    @Override
    public void fly() {
        System.out.println("Fly from mallard");
    }
}
