package com.基础课程代码练习.反射;

import java.lang.reflect.Modifier;

/**
 * @author Doraemon
 * @date 2022/5/15 3:24 下午
 * @version 1.0
 */
public class ReflectDemoGetFieldAndPublic {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // 获取  Class 类的对象
        Class classObj = dog.getClass();

        // 获取 Dog 类的访问修饰符
        int modifier = classObj.getModifiers();
        System.out.println("修饰符号：" + Modifier.toString(modifier));

        // 获取 Dog 类的父类
        Class superClass = classObj.getSuperclass();
        System.out.println("super class is : " + superClass.getName());
        }
}
