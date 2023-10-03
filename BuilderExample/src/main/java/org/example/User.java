package org.example;

public class User {
    private String id;
    private String color;

    public User(String id, String color) {
        this.id = id;
        this.color = color;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
