package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        assert colorFactory != null;
        Color red = colorFactory.getColor("Red");
        red.fill();


        List<String> ee= Arrays.asList("a","b","c");

        for(String item: ee){
            System.out.println(item);
        }

        System.out.println("Hello world!");
        var ers= true && false || true;
        System.out.println(ers);
    }
}