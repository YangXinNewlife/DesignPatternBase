package null0;

/**
 * @author yangxin_ryan
 */
public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustoimer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustoimer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustoimer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustoimer("Laura");
        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
