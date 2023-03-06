package 设计模式.建造者模式;

/**
 * @author Doraemon
 * @date 2022/5/26 11:42 上午
 * @version 1.0
 */
public class ConcreteBuilder1 implements Builder{
    Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("add partA");
    }

    @Override
    public void buildPartB() {
        product.add("add partB");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
