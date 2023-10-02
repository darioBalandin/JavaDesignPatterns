package org.example;

public interface Turkey {

    void gobble();

    void fly();
}

class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Turkey globbles");
    }

    @Override
    public void fly() {
        System.out.println("Turkey flies");
    }
}
