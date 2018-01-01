import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private static List<Customer> mCustomers = new ArrayList<Customer>();

    public static void addCustomer(Customer customer) {
        if (!mCustomers.contains(customer)) {
            mCustomers.add(customer);
        }
    }

    public static void handlerRequest(Visitor visitor) {
        if (visitor == null) {
            return;
        }
        int size = mCustomers.size();
        if (size == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            mCustomers.get(i).accept(visitor);
        }
    }

}
