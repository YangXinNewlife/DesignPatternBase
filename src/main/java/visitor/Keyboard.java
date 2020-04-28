package visitor;

/**
 * @author yangxin_ryan
 */
public class Keyboard implements ComputePart {

    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
