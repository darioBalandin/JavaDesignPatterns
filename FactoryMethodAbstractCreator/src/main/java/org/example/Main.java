package org.example;

public class Main {
    public static void main(String[] args) {

        Shape shape = new CircleFactory().getShape();

        shape.draw();


        Shape shape2 = new SquareFactory().getShape();

        shape2.draw();


        Shape shape3 = new RectangleFactory().getShape();

        shape3.draw();


    }
}