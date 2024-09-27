package Java.Mouritech.venkat.Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequ {
	public static void main(String[] args) {
		Deque<Integer> d=new ArrayDeque<Integer>(); 
		d.add(6);
		d.offer(4);
		d.offer(7);
		d.offer(1);
		d.offer(9);
		d.offer(3);
		System.out.println(d);
        d.offerFirst(2);
        System.out.println(d);
        d.offerLast(15);
        System.out.println(d);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
	}
}
