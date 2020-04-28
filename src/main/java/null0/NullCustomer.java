package null0;

/**
 * @author yangxin_ryan
 */
public class NullCustomer extends AbstractCustomer {

    public String getName() {
        return "Not Available in Customer Database";
    }

    public boolean isNil() {
        return true;
    }
}

