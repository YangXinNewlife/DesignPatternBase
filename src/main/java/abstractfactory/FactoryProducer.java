package abstractfactory;

/**
 * @author yangxin_ryan
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choine) {
        if (choine.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choine.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
