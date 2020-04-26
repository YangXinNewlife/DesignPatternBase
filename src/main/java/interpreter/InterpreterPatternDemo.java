package interpreter;

/**
 * @author yangxin_ryan
 */
public class InterpreterPatternDemo {

    /**
     * config Robert and John is male
     * @return
     */
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    /**
     * Config Julie is Married
     * @return
     */
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);

    }

    public static void main(String[] args) {
        Expression isMaile = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("John is male ? " + isMaile.interpret("John"));
        System.out.println("Julie is a married women ? " + isMarriedWoman.interpret("Married Julie"));
    }
}
