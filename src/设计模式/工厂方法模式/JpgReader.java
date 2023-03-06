package 设计模式.工厂方法模式;

/**
 * @author Doraemon
 * @date 2022/5/6 1:13 下午
 * @version 1.0
 */
public class JpgReader implements Reader{
    @Override
    public void read() {
        System.out.println("加载 jpg 图片");
    }
}
