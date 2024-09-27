package Java.Mouritech.Venkat1;

public class Methods {
	public static void m1() {
		System.out.println("Hello Venkat");
	}
	public static void m2() {
		System.out.println("Hello Venkat");
	}
	public static int m3(int x,int y) {
		int c=x*y;
		return c;
	}
	public static void m4(int a, int b) {
		int d=a+b/b-a;
		System.out.println(d);
	}

	public static void main(String[] args) {
		m1();
		m2();
		int a=m3(10,20);
		System.out.println(a);
		m4(20,30);
	}

}
