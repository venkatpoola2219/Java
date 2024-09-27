package Java.Mouritech.venkat;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int num=sc.nextInt();
		System.out.println("enter Name");
		String c=sc.next();
		System.out.println("enter Char");
		char a=sc.next().charAt(2);
		System.out.println("enter Percentage");
		float p=sc.nextFloat();
		System.out.println(num*5);
		System.out.println(c);
		System.out.println(a);
		System.out.println(p);
		sc.close();

	}

}
