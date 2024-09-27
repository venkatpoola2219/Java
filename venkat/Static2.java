package Java.Mouritech.venkat;

import java.util.Scanner;

public class Static2 {
	static int a;
	static int b;
	static {
		Scanner sc=new Scanner(System.in);
		System.out.println("number1");
		a=sc.nextInt();
		System.out.println("number2");
		b=sc.nextInt();
		sc.close();
	}
	
	public static void main(String[] args) {
	
	    System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
       
	}

}

