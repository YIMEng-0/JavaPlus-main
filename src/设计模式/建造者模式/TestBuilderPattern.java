package 设计模式.建造者模式;

import Java课程作业.考试题目练习.知识点练习.枚举数据类型.Directions;

/**
 * @author Doraemon
 * @date 2022/5/26 11:53 上午
 * @version 1.0
 */
public class TestBuilderPattern {
    public static void main(String[] args) {
        Director director =  new Director();

        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        // Director 指挥创建的是什么部件
        // 传递具体的建造类进去，创建相关的部件
        director.Construct(b1);

        // 产品获得上面 Director 中创建出来的每个部分产品，得到最终的结果
        Product p1 = b1.getResult();
        p1.showParts();

        director.Construct(b2);
        Product p2 = b2.getResult();
        p2.showParts();
    }
}
