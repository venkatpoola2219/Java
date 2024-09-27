package Java.Mouritech.venkat.Collection;

import java.util.ArrayList;

public class list1 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("venkat");
		a.add("poola");
		a.add("saikumar");
		a.add("charan");
		a.add("harsha");
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		System.out.println(a);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
			System.out.println("---------");
			
		}
		
	}

}
