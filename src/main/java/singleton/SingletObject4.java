package singleton;

/**
 * @author yangxin_ryan
 * 双检索/双重校验锁，线程安全
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 */
public class SingletObject4 {

    private volatile static SingletObject4 singleton;
    private SingletObject4(){}
    public static SingletObject4 getInstance() {
        if (singleton == null) {
            synchronized (SingletObject4.class) {
                if (singleton == null) {
                    singleton = new SingletObject4();
                }
            }
        }
        return singleton;
    }
}
