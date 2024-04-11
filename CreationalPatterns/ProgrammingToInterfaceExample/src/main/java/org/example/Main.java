package org.example;

public class Main {
    public static void main(String[] args) {

        Computer computer= new Computer();

        DisplayModule displayModule = new Monitor();
        DisplayModule displayModule1 = new Proyector();

        computer.setDisplayModule(displayModule);
        computer.display();

        computer.setDisplayModule(displayModule1);
        computer.display();


    }
}