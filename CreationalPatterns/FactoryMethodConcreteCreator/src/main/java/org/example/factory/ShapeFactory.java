package org.example.factory;

import org.example.product.Circle;
import org.example.product.Rectangle;
import org.example.product.Shape;
import org.example.product.Square;

public class ShapeFactory {

    public static Shape getStaticShape(String shapeType){


        return switch (shapeType.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }

    public Shape getShape(String shapeType){


        return switch (shapeType.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
