package Java.Mouritech.venkat;

public class OddorEvenWithoutCondition {
	public static void main(String[] args) {
		int num=5;
		String[] a= {"even","odd"};
		String res= a[num & 1];
		System.out.println(num +" is "+res);
	}
}
