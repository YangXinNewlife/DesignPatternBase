package command;

/**
 * @author yangxin_ryan
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        ShellStock shellStock = new ShellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(shellStock);
        broker.placeOrders();
    }
}
