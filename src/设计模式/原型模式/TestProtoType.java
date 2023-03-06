package 设计模式.原型模式;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Doraemon
 * @date 2022/5/7 5:18 下午
 * @version 1.0
 */
public class TestProtoType  {
    public static void main(String[] args) {
        // 使用克隆出来的对象调用了自己的 doSomething 方法；
        Color blueCopy = ColorStore.getColor("blue");
        // 使用复制的对象做一些事情
        System.out.println("下面的方法是复制的对象调用的...");
        blueCopy.doSomething();

        Color blackCopy = ColorStore.getColor("black");
        // 使用复制的对象做一些事情
        System.out.println("下面的方法是复制的对象调用的...");
        blackCopy.doSomething();
    }
}
