package Java.Mouritech.venkat.Collection;

import java.util.*;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		//Map<Integer,String> m=new LinkedHashMap<Integer,String>();
		//Map<Integer,String> m=new TreeMap<Integer,String>();
		m.put(1,"venkat");
		m.put(2,"ashok");
		m.put(3, "harsha");
		m.put(4,"charan");
		m.put(5,"sai");
		System.out.println(m);
		m.remove(2);
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue("poola"));
		System.out.println(m.hashCode()); //it returns the memory reference number of object
		System.out.println(m.isEmpty());
		m.replace(3,"ram");
		System.out.println(m);
		System.out.println(m.size());
		m.putIfAbsent(1, "venkat");
		System.out.println(m);
		m.putIfAbsent(6,"harsha");
		System.out.println(m);

	}

}
