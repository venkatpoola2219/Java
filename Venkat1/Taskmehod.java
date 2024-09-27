package Java.Mouritech.Venkat1;
import java.util.Scanner;
public class Taskmehod {
	static int balance;
	static void deposit(int amt){
	balance=balance+amt;
	System.out.println(amt+" =Deposited");
	}
	static void withdraw(int amt){
	balance=balance-amt;
	System.out.println(amt+" =Withdrawn");
	}
	public static void main(String arg[]){
	System.out.println("Mouritech Bank");
	System.out.println("********************");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Balence");
	balance=sc.nextInt();
	System.out.println("Enter Deposit");
	int dep=sc.nextInt();
	System.out.println("Enter Withdraw Amount");
	int withd=sc.nextInt();
	System.out.println("Balance is= "+balance);
	deposit(dep);
	System.out.println("Balance is= "+balance);
	withdraw(withd);
	System.out.println("Balance is= "+balance);
	}

}
