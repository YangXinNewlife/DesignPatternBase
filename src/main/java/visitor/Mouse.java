package visitor;

/**
 * @author yangxin_ryan
 */
public class Mouse implements ComputePart {

    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
