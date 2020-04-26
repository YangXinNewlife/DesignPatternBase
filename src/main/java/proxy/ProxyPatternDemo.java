package proxy;

/**
 * @author yangxin_ryan
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("xxx.img");
        image.display();
        System.out.println("--------");
        image.display();
    }
}
