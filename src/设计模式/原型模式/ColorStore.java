package 设计模式.原型模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Doraemon
 * @date 2022/5/7 5:14 下午
 * @version 1.0
 */

/**
 * 从存储颜色的类中，进行颜色对象的复制
 */
public class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<>();

    static {
        colorMap.put("blue", new BlueColor());
        colorMap.put("black", new BlackColor());
    }

    public static Color getColor(String colorName) {
        // 子类可以强制转换成父类，但是在子类中只能获取父类的字段与方法
        // 这里拿到了抽象了父类 Color 的 克隆方法，这个方法是重写了 Object 类的 clone() 方法得到的
        return (Color) colorMap.get(colorName).clone();
    }
}
