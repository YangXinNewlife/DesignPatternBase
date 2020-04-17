package abstractfactory;

/**
 * @author yangxin_ryan
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        // get shape of Circle object
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // call Circle's draw Function
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
        // get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        // get color of RED object
        Color color1 = colorFactory.getColor("RED");
        // call RED's fill function
        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
