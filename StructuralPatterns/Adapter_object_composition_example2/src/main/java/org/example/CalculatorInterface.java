package org.example;

public interface CalculatorInterface {


    //target Interface

    double getArea(Rectangle r);
}

class Calculator implements CalculatorInterface {

    @Override
    public double getArea(Rectangle r) {
        return r.length * r.width;
    }
}
