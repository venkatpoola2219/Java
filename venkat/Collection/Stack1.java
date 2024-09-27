package Java.Mouritech.venkat.Collection;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> sk=new Stack<Integer>();
		sk.push(20);
		sk.push(10);
		sk.push(30);
		sk.push(40);
		sk.push(50);
		sk.push(60);
		sk.push(70);
		System.out.println(sk);
		sk.pop();
		System.out.println(sk);
		
		System.out.println(sk.peek());
		System.out.println(sk.search(60));

	}

}
