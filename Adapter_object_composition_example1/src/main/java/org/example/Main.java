package org.example;

public class Main {
    public static void main(String[] args) {


        Duck mallardDuck= new MallardDuck();

        Turkey wildTurkey= new WildTurkey();

        Duck turkeyAdapter= new TurkeyAdapter(wildTurkey);


        System.out.println("\nTurkey says...");
        wildTurkey.fly();
        wildTurkey.gobble();

        System.out.println("\nDuck says...");
        testDuck(mallardDuck);

        System.out.println("\nTurkey Adapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}