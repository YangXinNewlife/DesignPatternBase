package visitor;

/**
 * @author yangxin_ryan
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputePart compute = new Compute();
        compute.accept(new ComputerPartDisplayVisitor());
    }
}
