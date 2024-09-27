package Java.Mouritech.venkat.Collection;

import java.util.ArrayList;

public class InsertFiirstPosition {

	public static void main(String[] args) {
			ArrayList<String> a=new ArrayList<String>();
			a.add("venkat");
			a.add("poola");
			a.add("saikumar");
			a.add("charan");
			a.add("harsha");
			a.add(1,"sudharshan");
			System.out.println(a);
			System.out.println(a.get(4));
			a.remove(3);
			a.add(3,"ram");
			System.out.println(a);
			a.sort(null);
			System.out.println(a);
			 System.out.println();
			 
			 String name="venkat";
			 if(name.contains("venkat")) {
				 System.out.println("Yes");
			 }
				 else
				 {
					 System.out.println("No");
			 }
			
			

	}

}
