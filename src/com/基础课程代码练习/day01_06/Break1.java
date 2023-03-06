package com.基础课程代码练习.day01_06;

// break 在循环中有着终止循环的意义
// break 有着就近原则 影响着距离它比较近的循环 退出当前的循环
// continue 表示当前的循环跳出 进行下一个循环 关键字加上去 封号

import Java课程作业.醉酒走路问题.Test;
import com.sun.tools.javac.file.SymbolArchive;

public class Break1 {
    public static void main(String[] args) {
        new Thread(() -> {

        }, "t1").start();
    }



    // 多个线程访问这个代码块的时候，需要拿到类对象的锁，不然是不能访问的，为了线程安全；
    public synchronized static int add(int a, int b) {
        return a + b;
    }

    // 多个线程访问的时候，线程会访问到 this 对象，拿到 this 对象的的 Monitor 锁，多线程访问的时候，会存在排队机制
    public synchronized int decrease(int a, int b) {
        return a - b;
    }

    // 多线程访问的时候，会锁住 new 出来的当前对象，当然也是自定义的指定锁的对象；其他的线程访问的时候，都想要访问这个代码块，但是等着使用
    // 结束的线程，释放锁时候，可以再次的进入；
    public double multi(double a, double b) {
        // 多个线程访问到额时候，会锁住
        synchronized (this) {
            return a * b;
        }
    }

    /**
     * 使用 volatile 禁止指令重排引发的线程不安全的问题；
     *
     * 使用第一次的判断，放在 synchornized 外面，增加运行的效率
     *
     * 第三个防止正在等待的线程多次的重新创建出来对象，就不是单例模式了
     */
    public static volatile Test test;

    // DCl 的实现 单例模式
    public Object singleton() {
        // 这个判断不在并发语句块中，可以使得访问的效率增加
        if (test != null) {
            return test;
        }

        synchronized (Test.class) {
            // 防止正在排队的线程多次的重新创建出来一个对象；
            if (test == null) {
                test = new Test();
            }
        }

        return test;
    }

    // 在构造方法上面直接写 synchornized 这样子没有什么存在意义，但是存在静态资源的额共享的时候，是需要同步操作的；
    public Break1() {
        synchronized (this) {
            System.out.println("Hello");
        }
    }



    /**
     * synchornized 里面的实现原理：
     *      在字节码的层面上，会对多线程访问的同步代码块进行一个加锁以及解锁的操作；也就是说，多线程的访问的视乎
     *  刚一开始想要访问共享代码块的时候，自己加锁，放置其他线程的访问，访问结束之后，将锁释放掉，以供其他线程的访问；
     *
     * 锁的优化机制：
     *      在 JDK 1.6 的时候，进行了偏向锁，轻量级锁，可重入锁，重量级锁，锁消除的优化；
     *  所谓的锁优化就是：当我们创建出来了一个加锁的代码块，但是没有多线程对于这个代码块进行访问，那么加锁的效果和不加锁的效果一致；
     *  JVM 会自动的进行将锁消除，优化程序运行的性能；
     */
}