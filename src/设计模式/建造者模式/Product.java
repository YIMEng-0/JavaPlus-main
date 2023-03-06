package 设计模式.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Doraemon
 * @date 2022/5/26 11:45 上午
 * @version 1.0
 */
public class Product {
    List<String> list = new ArrayList<>();
    public void add(String part) {
        list.add(part);
    }

    public void showParts() {
        System.out.println(list);
    }
}
