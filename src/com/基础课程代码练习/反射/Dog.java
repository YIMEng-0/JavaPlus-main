package com.基础课程代码练习.反射;

/**
 * @author Doraemon
 * @date 2022/5/15 3:22 下午
 * @version 1.0
 */
public class Dog implements Animal, Mammal{
    public String type;
    private String color;

    @Override
    public void display() {
        System.out.println("this is a dog...");
    }

    @Override
    public void makeSound() {
        System.out.println("dog is backing...");
    }

    protected void eat() {
        System.out.println("dog is eating...");
    }

    public Dog(String type) {
        this.type = type;
    }

    public Dog() {

    }

    public Dog(String type, String color) {
        this.type = type;
        this.color = color;
    }
}
