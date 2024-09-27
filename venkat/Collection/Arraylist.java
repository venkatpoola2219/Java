package Java.Mouritech.venkat.Collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("venkat");
		a.add("poola");
		a.add("saikumar");
		a.add("charan");
		a.add("harsha");
		a.add(1,"sudharshan");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.removeAll(a);
		//a.clear();
		System.out.println(a);
		
        //ArrayList all=(ArrayList)a.clone();
		//all.set(4,"NANA");
		//System.out.println(all);
		//System.out.println(a);	
		//System.out.println(a.get(1));

	}

}
