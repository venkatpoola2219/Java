package Java.Mouritech.venkat;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter String");
		  String str=sc.nextLine();
		  sc.close();
		  String rev="";
		  for(int i=str.length()-1;i>=0;i--)
		  {
		   rev=rev+str.charAt(i);
		  }
		  System.out.println(rev);
		  if(rev.equals(str))
			  System.out.println("Palindrome");
		  else
			  System.out.println("Not Palindrome");
		  
		}
}
