package Java.Mouritech.venkat2;

import java.util.Scanner;

public class AverageofThreeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input1");
		int n1=sc.nextInt();
		System.out.println("Enter input2");
		int n2=sc.nextInt();
		System.out.println("Enter input3");
		int n3=sc.nextInt();
	    double res=(n1+n2+n3)/3;
	    System.out.println("Average number= "+res);
	}

}
