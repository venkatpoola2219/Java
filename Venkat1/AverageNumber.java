package Java.Mouritech.Venkat1;

import java.text.DecimalFormat;

public class AverageNumber {
	public static void Calculator(double a,double b,double c) {
		DecimalFormat df = new DecimalFormat("0.00");  
		double res=(a+b+c)/3;
		System.out.println(df.format(res));
		
	}
	public static void main(String[] args) {
		 
		Calculator(12,8,15);
		Calculator(10,20,30);
		
	}
}



//public class AverageNumber {
//    public static void Calculator(double a, double b, double c) {
//        // Calculate the average
//        double res = (a + b + c) / 3;
//
//        // Format the result to 2 decimal places
//        String formattedRes = String.format("%.2f", res);
//
//        // Print the formatted result
//        System.out.println(formattedRes);
//    }
//
//    public static void main(String[] args) {
//        // Call the Calculator method with different sets of numbers
//        Calculator(12, 8, 15);
//        Calculator(10, 20, 30);
//    }
//}
//
