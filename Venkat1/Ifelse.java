package Java.Mouritech.Venkat1;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id");
		String s=sc.nextLine();
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		if(s.equals("venkat"))
			System.out.println("Authorised user");
		else
			System.out.println("Un-Authorised User");
		
		if(marks>=35)
			System.out.println("pass");
		else
			System.out.println("Fail");
	}
}
