package Java.Mouritech.Venkat1;

import java.util.Scanner;

public class Ifelse_isEmpty {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter user");
		String a=sc.nextLine();
		if(a.isEmpty())
			System.out.println("Field should not be empty");
		else
			System.out.println("Thank you "+a.toUpperCase()); // It will converts the Uppercases
		    System.out.println("Thank you "+a.toLowerCase()); // it will converts the lowercase
		    System.out.println("Thank you "+a.trim()); //It will removes the starting spaces
		    
		
	}

}
