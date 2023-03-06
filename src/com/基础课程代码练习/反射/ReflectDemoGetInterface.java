package com.基础课程代码练习.反射;

/**
 * @author Doraemon
 * @date 2022/5/15 3:31 下午
 * @version 1.0
 */
public class ReflectDemoGetInterface {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        // 使用 d1 对象获得 Class 类，这个 Class 类中保存了 d1 对象的信息以及 创建 d1 对象的类的相关信息
        Class obj = d1.getClass();

        // 使用反射获得 d1 对象 实现的接口信息
        Class[] objInterface = obj.getInterfaces();

        for (Class c : objInterface) {
            System.out.println("实现的接口的名称是： " + c.getName());
        }
    }
}
