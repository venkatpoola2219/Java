package Java.Mouritech.venkat;

public class Boxing {
	public static void main(String[] args) {
		int a=25;
		Integer obj=a;   //autoboxing
		System.out.println(obj);
		
		Integer ob=50;  //unboxing
		int b=ob;
		System.out.println(b);   
		
	         int e=2024;
	         String s="July";
		System.out.printf("Year is %d and Month is %s",e,s);
	}
}