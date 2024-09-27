package Java.Mouritech.venkat.projects;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        // Input customer details and meter readings
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
 
        System.out.print("Enter Customer ID: ");
        int customerID = scanner.nextInt();
 
        System.out.print("Enter Previous Meter Reading: ");
        double previousReading = scanner.nextDouble();
 
        System.out.print("Enter Current Meter Reading: ");
        double currentReading = scanner.nextDouble();
 
        System.out.print("Enter Rate per Unit: ");
        double ratePerUnit = scanner.nextDouble();
 
        // Create an object of ElectricityBill and calculate bill
        ElectricityBill bill = new ElectricityBill(customerName, customerID, previousReading, currentReading, ratePerUnit);
 
        // Print the generated bill
        bill.printBill();
 
        scanner.close();
    }
}