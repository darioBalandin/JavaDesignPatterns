package org.example;

public class TriangleAdapter implements CalculatorInterface {

    Calculator calculator;
    Triangle triangle;

    public TriangleAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle r) {

        calculator = new Calculator();
        r.length = triangle.base;
        r.width = triangle.height * 0.5;
        return calculator.getArea(r);
    }
}
