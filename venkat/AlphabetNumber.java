package Java.Mouritech.venkat;
import java.util.Scanner;
public class AlphabetNumber {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        int input = sc.nextInt();
	        
	        if (input < 1) {
	            System.out.println("Invalid input.");
	        } else {
	            String output = convertToColumnLabel(input);
	            System.out.println("Output: " + output);
	        }
	        
	    }
	    
	    public static String convertToColumnLabel(int number) {
	        StringBuilder columnLabel = new StringBuilder();
	        
	        while (number > 0) {
	            number--;  
	            int remainder = number % 26;
	            columnLabel.insert(0, (char) (remainder + 'A'));
	            number /= 26;
	        }
	        
	        return columnLabel.toString();
	    }
	}


