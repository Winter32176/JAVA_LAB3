package com.company.lamda;

public class Person {

    private String name;
    private int age;

    public Person() {
    }//default constructor

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "{" +
                "Name: " + name +
                "  Age: " + age +
                "}";
    }


}
