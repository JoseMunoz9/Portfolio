
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // i
        CustomerDAO dao = new MySQLCustomerDAO();

        // ii
        ArrayList<Customer> customers = dao.getCustomers();
        System.out.println(customers);

        Customer c = dao.findCustomerById(1);
        System.out.println(c);

        dao.saveCustomer(c);
        c = dao.findCustomerById(5);
        System.out.println(c);
        System.out.println(customers.size());

    }

}
