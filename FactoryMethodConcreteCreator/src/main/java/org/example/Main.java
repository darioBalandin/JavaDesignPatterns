package org.example;

import org.example.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();


        var shape1=shapeFactory.getShape("CIRCLE");

        shape1.draw();

        var shape2=shapeFactory.getShape("SQUARE");

        shape2.draw();

        var shape3=shapeFactory.getShape("rectangle");

        shape3.draw();

        var shape4=ShapeFactory.getStaticShape("CIRCLE");

        shape4.draw();


        System.out.println("Hello world!");
    }
}