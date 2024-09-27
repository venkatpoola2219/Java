

package Java.Mouritech.venkat;

import java.util.Scanner;

public class StaticOrClassVariable {
	static int num1;
	static int num2;
	static int tot;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num1");
		num1=sc.nextInt();
		System.out.println("num2");
		num2=sc.nextInt();
		sc.close();
		tot=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(tot);
	}

}

