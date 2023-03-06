package 设计模式.工厂方法模式;

/**
 * @author Doraemon
 * @date 2022/5/6 1:17 下午
 * @version 1.0
 */
public class PngReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new PngReader();
    }
}
