package Java.Mouritech.venkat2;

import java.util.Scanner;

public class Natural_Innerclases {
	public static void main(String[] args) {
		C a=new C();
		C.D d=a.new D();
		d.m1();
	}
}
class C{
	class D{
	public void m1() {
				for(char i='A';i<='Z';i++) {
			System.out.print(i+" ");
		}
	}
	}
}


	

