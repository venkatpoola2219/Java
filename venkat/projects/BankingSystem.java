package Java.Mouritech.venkat.projects;

public class BankingSystem {
    public static void main(String[] args) {
        Customer customer1 = new Customer("C001", "Alice", "alice@example.com");
        Customer customer2 = new Customer("C002", "Bob", "bob@example.com");

        Account account1 = new Account("ACC001", customer1);
        Account account2 = new Account("ACC002", customer2);

        account1.deposit(500);
        account1.withdraw(100);
        account1.transfer(account2, 150);

        System.out.println("Balance of " + account1.getAccountNumber() + ": " + account1.getBalance());
        System.out.println("Balance of " + account2.getAccountNumber() + ": " + account2.getBalance());
    }
}

