package Java.Mouritech.Venkat1;

import java.util.Scanner;

public class Task {
	public static int Balance(int x) {
		return x ;
		
	}
	public static int Deposit(int y) {	
		return y;
	}
	public static int tot(int a,int b) {
		int x=a+b;
		return x;
	}
	public static int with(int c,int d) {
		return c-d;
	}
	public static int tot2(int e,int f) {
		int z=e-f;
		return z;
	}


	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Balence Amount");
		int Bal=sc.nextInt();
		int bale=Balance(Bal);
		System.out.println("Deposited Amount");
		int Dep=sc.nextInt();
		int Depos=Deposit(Dep);
		int total=tot(bale,Dep);
		System.out.println("Withdraw Amount");
		int wit=sc.nextInt();
		int withd=with(total,wit);
		int tot1=tot2(total,withd);
		System.out.println("Balence is ="+bale);
		System.out.println("Deposited Amount is ="+Depos);
		System.out.println("Total Balence= "+total);
		System.out.println("Withdraw Amount ="+wit);
        System.out.println("Balence is = "+withd);


		
	}

}
