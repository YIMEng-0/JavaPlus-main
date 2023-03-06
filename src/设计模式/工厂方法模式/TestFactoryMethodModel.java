package 设计模式.工厂方法模式;

import com.基础课程代码练习.集合.ArrayList集合.Hashmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author Doraemon
 * @date 2022/5/6 1:19 下午
 * @version 1.0
 */
public class TestFactoryMethodModel {
    public static void main(String[] args) {
        /**
         *  代码的执行逻辑：
         *      1、使用工厂方法模式下不同的工厂创建出来一个工厂对象
         *      2、使用工厂对象生产出来一个用来加载特定图片的加载图片类的实例
         *      3、加载图片类的实例创建创建出来了，调用 read() 方法，加载图片
         *
         *      想要获得图片加载器对象，前提是得到工厂类对象，用工厂类对象调用方法得到图片加载器对象；
         *      工厂方法模式重点是，创建不同图片加载器对象，加载图片的对象创建出来之后，调用相关的方法执行加载图片即可；
         */
        ReaderFactory factory = new GifReaderFactory();
        Reader reader = factory.getReader();
        reader.read();


    }
}
