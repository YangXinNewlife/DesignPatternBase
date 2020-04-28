package visitor;

/**
 * @author yangxin_ryan
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    public void visit(Compute compute) {
        System.out.println("Displaying Compute.");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
