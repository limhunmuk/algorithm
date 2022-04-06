package stack;

import java.util.LinkedList;
import java.util.List;

public class LinkedListStack{

	int top = -1;
	List<Integer> list;
	public LinkedListStack() {
		list = new LinkedList<Integer>();
	}

	void push(int data) {
		list.add(++top, data);
	}
	
	void pop() {
		list.remove(top--);
	}
	
	void peek() {
		System.out.println("List peek > " + list.get(top));
		list.get(top);
	}
	
	void printStackAll() {
		for(int data : list) {
			System.out.println("linked stack >>" + data);
		}
	}
}
