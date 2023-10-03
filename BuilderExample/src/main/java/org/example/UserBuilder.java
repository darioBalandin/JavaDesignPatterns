package org.example;

public class UserBuilder {

    private String id;
    private String color;

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public UserBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public UserBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public User build() {
        return new User(id, color);
    }
}
