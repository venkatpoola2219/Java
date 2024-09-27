package Java.Mouritech.venkat.projects;
import java.time.LocalDateTime;
class Transaction {
     String transactionId;
     Account fromAccount;
     Account toAccount;
     double amount;
     LocalDateTime timestamp;

    public Transaction(String transactionId, Account fromAccount, Account toAccount, double amount) {
        this.transactionId = transactionId;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }
}

