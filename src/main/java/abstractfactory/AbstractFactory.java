package abstractfactory;

/**
 * @author yangxin_ryan
 * Crate AbstractFactor Abstruct Class
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
