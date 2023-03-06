package 设计模式.工厂方法模式;

/**
 * @author Doraemon
 * @date 2022/5/6 1:14 下午
 * @version 1.0
 */
public class PngReader implements Reader{
    public String name = "Jack";
    private static Integer age = 10;
    @Override
    public void read() {
        System.out.println("加载 png 图片");
    }
}
