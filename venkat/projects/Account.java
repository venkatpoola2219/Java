package Java.Mouritech.venkat.projects;

class Account {
     String accountNumber;
     Customer accountHolder;
     double balance;

    public Account(String accountNumber, Customer accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(Account toAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            toAccount.deposit(amount);
            Transaction transaction = new Transaction("TXN" + System.currentTimeMillis(), this, toAccount, amount);
            System.out.println("Transfer successful: " + amount + " to " + toAccount.getAccountNumber());
        } else {
            System.out.println("Transfer failed: Insufficient balance or invalid amount.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}