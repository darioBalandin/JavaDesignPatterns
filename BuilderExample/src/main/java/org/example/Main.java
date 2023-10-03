package org.example;

public class Main {
    public static void main(String[] args) {



        var userB= UserBuilder.builder();
        var user=userB.setColor("Blue")
                .setId("3")
                .build();

        System.out.println(user);

    }
}