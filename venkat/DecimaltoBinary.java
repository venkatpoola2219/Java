package Java.Mouritech.venkat;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		String bi="";
		while(num>0)
		{
	       int rem=num%2;
	       bi=bi+rem;
	       num/=2;
	       
	     }
				
       System.out.println(bi);
	}

}
