package org.example;

public abstract class Workshop {
    public abstract void work();

}
class Produce extends Workshop{

    @Override
    public void work() {
        System.out.println("Produced");
    }
}
class Assemble extends Workshop{

    @Override
    public void work() {
        System.out.println("Assembled");
    }
}