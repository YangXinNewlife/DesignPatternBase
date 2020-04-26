package command;

/**
 * @author yangxin_ryan
 */
public class ShellStock implements Order {

    private Stock absStock;

    public ShellStock(Stock absStock) {
        this.absStock = absStock;
    }

    public void execute() {
        absStock.sell();
    }
}
