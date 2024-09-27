package Java.Mouritech.venkat2;

public class Innerclass {
	public static void main(String[] args) {
		//	System.out.println("Hello");
		A a=new A();
		A.B b=a.new B();
		System.out.println(a.x);
		System.out.println(b.y);
	}
}
class A{
	int x=100;
	class B{
		int y=200;	
	}
}