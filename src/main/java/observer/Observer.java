package observer;

/**
 * @author yangxin_ryan
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
