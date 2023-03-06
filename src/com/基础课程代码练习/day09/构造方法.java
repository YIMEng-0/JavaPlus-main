package com.基础课程代码练习.day09;

/**
 *  1、关于 Java 中的构造方法 也叫做构造函数 构造器 constructor
 *  2、构造方法的语法结构：
 *      修饰符类标 构造方法名字（形式参数列表）{
 *          构造方法体
 *      }
 *  3、普通的方法是具有返回值数据类型的、构造方法是没有的
 *  4、对于构造方法来说，返回值类型不需要指定，不能写void 空下来什么也不写，写上void 变成了普通的方法
 *  5、构造方法名字和类名必须保持一致
 *  6、构造方法的作用？
 *      - 构造方法的存在就是通过调用构造方法可以创建对象
 *      - 构造方法的调用使用的是关键字 new 不是类名点 和 引用点
 *
 *  7、构造方法的调用？
 *  - 普通方法的调用：
 *      类名.方法名（实参列表）
 *      引用.方法名（实参列表）
 *  - 构造函数
 *      new 构造方法名（实参列表）
 *
 *  8、为什么构造函数的返回值类型不用写？
 *      每一个构造方法实际上执行结束后都有自己的返回值，但是return 不需要写，并且返回值类型是构造方法所在类的类型
 *      由于构造方法的返回值类型都是类本身，所以返回值类型不需要进行编写
 *
 *  9、一个类中没有定义任何的构造方法 系统默认的提供无参数的构造方法，这个构造方法叫做缺省构造器
 *  10、当一个类显示的将构造方法定义出来了，系统不在默认的缺省构造器，建议使用无参数的构造方法，无参数的额构造方法比较常用
 *  11、同一个类中，可以进行方法的重载，构造方法支持方法的重载
 */
public class 构造方法 {
    public static void main(String[] args) {
        // 创建User对象
        // 使用User类的构造方法完成对象的创建
        // 方法的重载
        // 调用了构造函数 在堆内存中创建对象
        // new 后面是一个构造方法的方法名字 用于创建对象

        // 关于方法的调用 没有Static 的时候，需要先进行创建一个对象 然后进行方法的调用
        // 有static 不需要进行对象的创建 通过类进行调用
        UserConstructor u =  new UserConstructor(); // 构造方法 创建对象
        UserConstructor u1 = new UserConstructor(10);
        UserConstructor u2 = new UserConstructor("Jack");

        // 为什么需要有构造函数？ 为了构造对象的时候使用 一般都是没有参数的构造函数 使用的比较多 说白了就是一种方法而已 不同的额特征

    }
}
