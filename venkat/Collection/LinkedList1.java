package Java.Mouritech.venkat.Collection;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		L.add("venkat");
		L.add("Mango");
		L.add("Apple");
		L.addFirst("poola");
		L.addLast("Banana");
		System.out.println(L);
		L.remove("Apple");
		System.out.println(L);
		L.removeFirst();
		System.out.println(L);
		L.removeLast();
		System.out.println(L);
		System.out.println(L.getFirst());
		System.out.println(L.getLast());

		
	}

}
