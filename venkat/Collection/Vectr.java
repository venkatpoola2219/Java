package Java.Mouritech.venkat.Collection;

import java.util.Vector;

public class Vectr {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
		v.add("F");
		v.add("G");
		v.add("H");
		v.add("I");
		v.add("J");
		//v.add("K");
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.get(5));
		v.remove(5);
		System.out.println(v);
		v.set(5, "ven");
		System.out.println(v);

	}

}
