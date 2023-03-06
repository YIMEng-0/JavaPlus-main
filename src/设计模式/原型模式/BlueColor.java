package 设计模式.原型模式;

/**
 * @author Doraemon
 * @date 2022/5/7 5:11 下午
 * @version 1.0
 */
public class BlueColor extends Color{
    public BlueColor() {
        this.colorName = "blue";
    }

    @Override
    void doSomething() {
        System.out.println("Blue Color do Something");
    }
}
