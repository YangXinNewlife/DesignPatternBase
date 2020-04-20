package singleton;

/**
 * @author yangxin_ryan
 * 懒汉式，线程安全
 * 这种方式具备很好的lazy loading，能够在多线程中很好的工作，但是效率很低，99%情况下不需要同步；
 */
public class SingletObject2 {

    private static SingletObject2 instance;

    private SingletObject2() {}

    public static synchronized SingletObject2 getInstance(){
        if (instance == null) {
            instance = new SingletObject2();
        }
        return instance;
    }
}
