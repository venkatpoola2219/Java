package Java.Mouritech.venkat;

public class UnaryOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a++ + ++a + 
				--a - --a - a--);
		System.out.println(a==b);
	}
}
