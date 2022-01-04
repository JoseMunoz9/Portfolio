
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySQLCustomerDAO implements CustomerDAO {

    DataSource db = DataSource.getInstance();

    @Override
    public ArrayList<Customer> getCustomers() {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        String query = "SELECT * FROM customer";

        ResultSet rs = db.select(query);
        int id = 0;
        String name = "";
        int phoneNumber = 0;
        String address = "";
        String statusString = "Single";
        Customer c = null;

        try {

            while (rs.next()) {
                id = rs.getInt(1);
                name = rs.getString(2);
                phoneNumber = rs.getInt(3);
                address = rs.getString(4);

                c = new Customer.CustomerBuilder(id, name).setAddress(address).setPhoneNumber(phoneNumber).build();
                customers.add(c);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return customers;
    }

    @Override
    public Customer findCustomerById(int id) {

        String query = "SELECT * FROM customer WHERE id = " + id + ";";
        ResultSet rs = db.select(query);

        String name = "";
        int phoneNumber = 0;
        String address = "";
        Customer c = null;

        try {

            if (rs.next()) {
                name = rs.getString(2);
                phoneNumber = rs.getInt(3);
                address = rs.getString(4);

                c = new Customer.CustomerBuilder(id, name).setAddress(address).setPhoneNumber(phoneNumber).build();
                return c;
            }

            return null;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean saveCustomer(Customer customer) {

        String name = customer.getName();
        int phoneNumber = customer.getPhoneNumber();
        String address = customer.getAddress();

        String query = "INSERT INTO customer (name, phone_number, address) VALUES ('" + name + "', " + phoneNumber + ", '" + address + "');";

        return db.save(query);

    }

}
