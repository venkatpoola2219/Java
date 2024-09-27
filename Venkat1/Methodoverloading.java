package Java.Mouritech.Venkat1;

public class Methodoverloading {
	static void m1() {
		System.out.println("venkat");
	}
	static void m1(int x) {
		System.out.println(x);
	}
	static void m1(float y) {
		System.out.println(y);
	}
	static void m1(String z) {
		System.out.println(z);
	}
	public static void main(String[] args) {
		m1();
		m1(20);
		m1(26f);
		m1("poola");
		m1("poola");
		m1();
		m1(26f);
		m1(20);

		
	}

}
