
public class Customer {

    private int id;
    private String name;
    private int phoneNumber;
    private String address;

    private Customer(CustomerBuilder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.phoneNumber = builder.getPhoneNumber();
        this.address = builder.getAddress();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Phone number: " + phoneNumber + " Address: " + address;
    }

    public static class CustomerBuilder {

        private int id;
        private String name;
        private int phoneNumber;
        private String address;

        public CustomerBuilder(int id, String name) {
            this.id = id;
            this.name = name;
            this.phoneNumber = 0;
            this.address = "Dublin";
        }

        public int getId() {
            return id;
        }

        public CustomerBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public CustomerBuilder setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public CustomerBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }

    }

}
