package singleton;

/**
 * @author yangxin_ryan
 * 懒汉式，线程不安全
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程，因为没有加锁synchronized，所以严格意义上并不算单例模式；
 */
public class SingletObject1 {

    private static SingletObject1 instance;

    private SingletObject1() {}

    public static SingletObject1 getInstance(){
        if (instance == null) {
            instance = new SingletObject1();
        }
        return instance;
    }
}
