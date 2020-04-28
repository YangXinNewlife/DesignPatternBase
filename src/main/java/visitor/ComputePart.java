package visitor;

/**
 * @author yangxin_ryan
 */
public interface ComputePart {

    public void accept(ComputerPartVisitor computerPartVisitor);

}
