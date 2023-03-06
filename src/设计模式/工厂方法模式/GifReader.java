package 设计模式.工厂方法模式;

/**
 * @author Doraemon
 * @date 2022/5/6 1:15 下午
 * @version 1.0
 */
public class GifReader implements Reader{
    @Override
    public void read() {
        System.out.println("加载 Gif 图片");
    }
}
