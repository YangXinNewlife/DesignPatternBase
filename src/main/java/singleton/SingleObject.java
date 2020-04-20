package singleton;

/**
 * @author yangxin_ryan
 */
public class SingleObject {
    // Create singleObject Object
    private static SingleObject instance = new SingleObject();
    // make construct private avoid instatiation
    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
