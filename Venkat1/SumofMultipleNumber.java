package Java.Mouritech.Venkat1;

import java.util.Scanner;

public class SumofMultipleNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int res=Multiply(num);
		System.out.println(res);
	}
	public static int Multiply(int num) {
		int res=0;
		for(int i=1;i<=10;i++) {
			int mul=num*i;
			 res=res+mul;
		}
		return res;
	}

}
