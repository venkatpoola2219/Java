package Java.Mouritech.venkat.projects;

class ElectricityBill {
    public String customerName;
    public int customerID;
    public double previousReading;
    public double currentReading;
    public double unitsConsumed;
    public double ratePerUnit;
    public double totalAmount;
 
    // Constructor
    public ElectricityBill(String customerName, int customerID, double previousReading, double currentReading, double ratePerUnit) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.unitsConsumed = currentReading - previousReading;
        this.ratePerUnit = ratePerUnit;
        this.totalAmount = calculateBill();
    }
 
    // Method to calculate bill
    public double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }
 
    // Method to print bill details
    public void printBill() {
        System.out.println("Electricity Bill for Customer: " + customerName);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Previous Reading: " + previousReading + " units");
        System.out.println("Current Reading: " + currentReading + " units");
        System.out.println("Units Consumed: " + unitsConsumed + " units");
        System.out.println("Rate per Unit: $" + ratePerUnit);
        System.out.println("Total Amount: $" + totalAmount);
    }
 
    // Getter for Total Amount
    public double getTotalAmount() {
        return totalAmount;
    }
}