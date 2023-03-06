package com.基础课程代码练习.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


/**
 * @author Doraemon
 * @date 2022/5/15 6:52 下午
 * @version 1.0
 */
public class ReflectFieldMethodConstruct {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        Class obj = d1.getClass();

        try {
            Field field1 = obj.getField("type");
            field1.set(d1, "Hello type has been changed");
            String typeValue = (String) field1.get(d1);
            System.out.println("type : " + typeValue);

            /**
             * 获取类型的访问修饰符
             */
            int mod1 = field1.getModifiers();
            String modifier1 = Modifier.toString(mod1);
            System.out.println("字段的修饰符是： " + modifier1);
            System.out.println("");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        testPrivateField();

        testPublicMethod();

        testReflectConstructor();
    }

    /**
     * 利用反射访问私有字段
     */
    public static void testPrivateField() {
        try {
            Dog d1 = new Dog();
            Class obj = d1.getClass();
            Field field2 = obj.getDeclaredField("color");
            field2.setAccessible(true);
            field2.set(d1, "Blue");
            String colorValue = (String) field2.get(d1);
            System.out.println("利用反射获取到的私有字段的颜色是： " + colorValue);
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testPublicMethod() {
        try {
            // 创建动物对象
            Dog d1 = new Dog();

            // 使用动物对象获取到 Class 对象
            // Class 对象中保留了有关类以及对象的所有信息 d1 的 Class 对象中保存了 Dog 类以及 Dog 类创建出来的对象的所有信息
            Class obj = d1.getClass();

            // 使用 Class 对象，调用实例方法，得到相关类的方法信息
            Method[] method = obj.getDeclaredMethods();
            for (Method m : method) {
                System.out.println("方法名称是： " + m.getName());

                // 获取修饰方法的修饰符 public protected default private 四种修饰符号
                int modifier = m.getModifiers();
                System.out.println("方法的修饰符是： " + Modifier.toString(modifier));

                // 获取方法的返回值类型
                System.out.println("Return Types: " + m.getReturnType());
                System.out.println("");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testReflectConstructor() {
        try {
            Dog dog = new Dog();
            Class obj = dog.getClass();

            Constructor[] constructor = obj.getDeclaredConstructors();

            for (Constructor c : constructor) {
                System.out.println("构造函数的名字是： " + c.getName());
                int modifier = c.getModifiers();
                System.out.println("构造方法的修饰符是：" + Modifier.toString(modifier));
                System.out.println("构造函数中参数的个数： " + c.getParameterCount());
                System.out.println("");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
