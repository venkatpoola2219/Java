package Java.Mouritech.venkat2;

public class Main  {
  public static void main(String[] args) {
	 	Two t=new Two();
	 	t.m2();
	 	One o=new One();
	 	o.m1();
	 	o.m2();
	 	System.out.println();
	 	System.out.println();
	 	Guest g=new Guest();
	 	System.out.println(g.x);
	 	g.read();
	 	System.out.println();

	 	Developer d= new Developer();
	 	System.out.println(d.y);
	 	System.out.println(d.x);
	 	d.write();
	 	d.read();
	 	System.out.println();

	 	Admin a=new Admin();
	 	System.out.println(a.x+a.y);
	 	a.manage();
	 	a.write();
	 	a.read();
	 	
	 	
  }
}
