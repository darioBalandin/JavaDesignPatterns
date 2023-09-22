package org.example;

public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);

}

class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return switch (shapeType.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }

}

class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return switch (color.toLowerCase()) {
            case "red" -> new Red();
            case "blue" -> new Blue();
            case "green" -> new Green();
            default -> null;
        };
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }

}
