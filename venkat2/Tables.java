package Java.Mouritech.venkat2;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Data");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}

}
