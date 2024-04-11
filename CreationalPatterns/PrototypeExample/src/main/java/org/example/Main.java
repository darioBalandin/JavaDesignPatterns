package org.example;

public class Main {
    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");

        clonedShape.draw();
        System.out.println(clonedShape.getType());
        System.out.println(clonedShape.getClass());

    }
}