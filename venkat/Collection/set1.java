package Java.Mouritech.venkat.Collection;

import java.util.HashSet;
import java.util.Set;

public class set1 {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("java");
		h.add("html");
		h.add("css");
		h.add("javascript");
		h.add("reactjs");
		h.add("sql");
		h.add("mangodb");
		System.out.println(h);
		h.remove("mangodb");
		System.out.println(h);
		System.out.println();
		Set h1=new HashSet();
		h1.add("java");
		h1.add("html");
		h1.add("css");
		h1.add("javascript");
		System.out.println(h1);
		System.out.println(h.containsAll(h1));
		Object[] arr=h1.toArray();
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(arr[i]+" ");
		}
	}
}
