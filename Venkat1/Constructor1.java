package Java.Mouritech.Venkat1;

public class Constructor1 {
	int n;
	Constructor1(){
		 n=10;
	}
	Constructor1(int x){
		n=x;
	}
	public static void main(String[] args) {
		Constructor1 a=new Constructor1();
		 System.out.println(a.n);
		 Constructor1 ab=new Constructor1(20);
		 System.out.println(ab.n);
	}
}
