package visitor;

/**
 * @author yangxin_ryan
 */
public class Monitor implements ComputePart {

    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
