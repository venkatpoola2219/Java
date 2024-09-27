package Java.Mouritech.venkat;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Num");
    int n=sc.nextInt();
    System.out.println("Enter Num1");
    int n1=sc.nextInt();
    System.out.println("Enter Num2");
    int n2=sc.nextInt();
    System.out.println("Enter Num3");
    int n3=sc.nextInt();
    sc.close();
    System.out.println("Sum="+(n+n1+n2+n3));
    System.out.println("sub="+ (n-n1-n2-n3));
    System.out.println("Avg = "+(n+n1+n2+n3)/4);
    
	}

}
