package 设计模式.简单工厂模式;

import com.sun.media.sound.SoftAudioPusher;

/**
 * @author Doraemon
 * @date 2022/5/5 11:14 上午
 * @version 1.0
 */
public class AnimalFactory {
    public static final String TAG = "AnimalFactory";

    public static Animal getAnimal(String type) {
        if ("Tiger".equalsIgnoreCase(type)) {
            return new Tiger();
        } else if ("Lion".equalsIgnoreCase(type)) {
            return new Lion();
        } else if ("Elephant".equalsIgnoreCase(type)) {
            return new Elephant();
        } else {
            try {
                System.out.println("该动物无法被该动物工厂创建出来");
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
