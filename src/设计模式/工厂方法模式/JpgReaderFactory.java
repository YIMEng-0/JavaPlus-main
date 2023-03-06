package 设计模式.工厂方法模式;

/**
 * @author Doraemon
 * @date 2022/5/6 1:16 下午
 * @version 1.0
 */
public class JpgReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new JpgReader();
    }
}
