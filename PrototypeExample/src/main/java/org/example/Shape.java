package org.example;

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;
    abstract void draw();


    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class Rectangle extends Shape{

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Rectangle() {
        type= "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside rectangle");

    }
}

class Square extends Shape{


    public Square() {
        type= "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside square");

    }
}

