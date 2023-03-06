package 设计模式.建造者模式;

/**
 * @author Doraemon
 * @date 2022/5/26 11:50 上午
 * @version 1.0
 */
public class Director {
    public void Construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
