package 设计模式.建造者模式;

/**
 * @author Doraemon
 * @date 2022/5/26 11:40 上午
 * @version 1.0
 */
public interface Builder {
    void buildPartA();
    void buildPartB();
    Product getResult();
}
