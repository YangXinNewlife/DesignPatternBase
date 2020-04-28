package visitor;

/**
 * @author yangxin_ryan
 */
public interface ComputerPartVisitor {
    public void visit(Compute compute);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
