package Java.Mouritech.venkat;

import java.util.Scanner;

public class TwoStringEqualsOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		sc.close();
		if(str1.equals(str2))
		  System.out.println("Two Strings Are Equal");
		else
		  System.out.println("Two Strings Are Not Equal");
	}

}
