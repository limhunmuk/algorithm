package com.test;

import java.util.EmptyStackException;

public class StackTest {

	Node<Character> top;
	int size = 0;
	public StackTest() {
		// TODO Auto-generated constructor stub
	}
	
	private void push(Character data) {
		Node<Character> n = new Node<>();
		n.data = data;
		n.next = top;
		top = n;
		size++;
	}
	
	private Character peek() {
		if(top == null) throw new EmptyStackException();
		return top.data;
	}
	
	private Character pop() {
		Character data = top.data;
		top = top.next;
		size--;
		return data;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0 ? true : false; 
	}
	
	public static void main(String[] args) {
		StackTest st = new StackTest();
//		st.push(2);
//		st.push(3);
//		st.push(7);
//		System.out.println("peek > " + st.peek());
//		st.pop();
//		System.out.println("peek > " + st.peek());
//		st.pop();
//		System.out.println("peek > " + st.peek());
		String 회문 = "소주한병만주소";
		char[] c = 회문.toCharArray();
		for(int i=0; i<c.length; i++) {
			st.push(c[i]);
		}
		
		StringBuffer sb = new StringBuffer();
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
		
		System.out.println(sb.toString());
	}
}
