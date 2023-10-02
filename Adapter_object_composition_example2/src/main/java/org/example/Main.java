package org.example;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle= new Rectangle(5,5);
        CalculatorInterface calculatorInterface= new Calculator();

        System.out.println(calculatorInterface.getArea(rectangle));




    }
}