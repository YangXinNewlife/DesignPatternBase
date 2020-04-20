package singleton;

/**
 * @author yangxin_ryan
 * 饿汉式，线程安全
 * 这种方式比较常见，但容易产生垃圾对象。它基于classloader机制避免了多线程的同步，不过instance在类装载时就实例化，
 * 虽然导致类装载的原因有很多，在单例模式中大多数都是调用getInstance方法，但是也不能确定有其他的方式（或者其他静态方法）导致类加载。
 * 这时候初始化intance显然没有达到lazy loading效果
 */
public class SingletObject3 {

    private static SingletObject3 instance = new SingletObject3();
    private SingletObject3(){}
    public static SingletObject3 getInstance(){
        return instance;
    }
}
