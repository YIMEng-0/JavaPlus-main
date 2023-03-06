package 设计模式.原型模式;

/**
 * @author Doraemon
 * @date 2022/5/7 5:07 下午
 * @version 1.0
 */

/**
 * Color 类实现了 Cloneable 接口，Color 类的实例 可以调用 Object 类里面的 clone() 方法
 */
public abstract class Color implements Cloneable {
    protected String colorName;

    abstract void doSomething();

    @Override
    protected  Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
