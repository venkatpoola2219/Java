package Java.Mouritech.venkat;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=arms(num);
		if(res==num)
		{
		 System.out.println(res);
		 System.out.println("Armstrong");
		}
		else {
			System.out.println(res);
			 System.out.println("Not-Armstrong");
		}
	}
	public static int arms(int num) {	
		int res=0;
		while(num>0) {
			int rem=num%10;
			 res=res+rem*rem*rem;
			 num=num/10;
		}
		return res ;
	}

}
