package org.example;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeHashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) {

        Shape cachedShape = shapeHashtable.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeHashtable.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("2");
        shapeHashtable.put(square.getId(), square);

    }

}
