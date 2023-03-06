package Java课程作业.hashCodeEquals.dog;

import java.util.Objects;
import java.util.concurrent.*;


// tetstetst
public class Dog {


    private String name = "noname";
    private String color = "unknown";
    private double age = 0.0;

    ////////////////////
    public static void info() {
        System.out.println("Dog类描述狗这种动物。");
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        this.age = 0;
    }

    public Dog(String name, String color, double age) {
        this(name, color);
        this.age = age;
    }

    public Dog() {
//		this.name="noname";
//		this.color="not know";
//		this.age=0;
    }

    public void setDog(String name, String color, double age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.println("name:" + name);
        System.out.println("color:" + color);
        System.out.println("age:" + age);
    }

    public void run() {
        System.out.println("我可以跑。");
    }

    // 进行 equals 方法 hashCode 方法的重写


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dog dog = (Dog) o;
        return Double.compare(dog.age, age) == 0 && Objects.equals(name, dog.name) && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }


    // 使用这种方式创建出来的线程池的任务队列是可以控制的，使用 Executors 工具类进行线程创建的话，有可能由于等待队列的无界性，导致的 OOM 内存溢出
    ThreadFactory factory = new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            return null;
        }
    };

    ThreadPoolExecutor.DiscardOldestPolicy discardOldestPolicy = new ThreadPoolExecutor.DiscardOldestPolicy();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10,
            1000, TimeUnit.SECONDS,
            new ArrayBlockingQueue(10), factory, discardOldestPolicy);
}
