package command;

/**
 * @author yangxin_ryan
 */
public class BuyStock implements Order {

    private Stock abcStack;

    public BuyStock(Stock abcStack) {
        this.abcStack = abcStack;
    }

    public void execute() {
        abcStack.buy();
    }
}
