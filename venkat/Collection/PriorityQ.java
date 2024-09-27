package Java.Mouritech.venkat.Collection;

import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add(5);
		q.offer(15);
		q.offer(4);
		q.offer(2);
		System.out.println(q);
		q.remove(); //it is used to retrives and remove head portion.
		System.out.println(q);
		//q.removeAll(q);
		//System.out.println(q);
		//System.out.println(q.poll());// poll method is used to remove and retrive data in head portion and array is empty then it will give null
        System.out.println(q.peek());//peek method i used retrive the head portion data and array is empty then it will give null.
        
	}

}
