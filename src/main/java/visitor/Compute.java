package visitor;

/**
 * @author yangxin_ryan
 */
public class Compute implements ComputePart {

    ComputePart[] parts;

    public Compute() {
        parts = new ComputePart[] {
                new Mouse(),
                new Keyboard(),
                new Monitor()};
    }

    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
