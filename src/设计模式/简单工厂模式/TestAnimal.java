package 设计模式.简单工厂模式;

/**
 * @author Doraemon
 * @date 2022/5/5 11:20 上午
 * @version 1.0
 */
public class TestAnimal {
    public static void main(String[] args) {
        // 老虎在行走
        Animal tiger = AnimalFactory.getAnimal("tiger");
        tiger.run();

        // 狮子在行走
        Animal lion = AnimalFactory.getAnimal("Lion");
        lion.run();

        // 大象在行走
        Animal elephant = AnimalFactory.getAnimal("Elephant");
        elephant.run();

    }
}
