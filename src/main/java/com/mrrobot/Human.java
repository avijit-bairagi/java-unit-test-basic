package com.mrrobot;

public class Human {
    String name;
    int age;
    boolean isEducated;

    public Human() {
    }

    public Human(String name, int age, boolean isEducated) {
        this.name = name;
        this.age = age;
        this.isEducated = isEducated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsEducated() {
        return isEducated;
    }

    public void setIsEducated(boolean isEducated) {
        this.isEducated = isEducated;
    }
}
