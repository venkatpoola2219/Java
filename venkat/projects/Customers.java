package Java.Mouritech.venkat.projects;

class Customer {
     String customerId;
     String name;
     String email;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}