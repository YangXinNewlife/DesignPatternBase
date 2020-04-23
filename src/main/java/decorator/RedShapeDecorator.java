package decorator;

/**
 * @author yangxin_ryan
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
}
