package stack;

public class StackTest {
	class Node {
		Node next;
		int data;
		Node(int data){
			this.data = data;
		}
	}
	
	Node top;
	
	void push(int data){
		Node n = new Node(data);
		n.next = top;
		top = n;
	}
	
	int peek() {
		return top.data;
	}
	
	int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}
	
	boolean isEmpty() {
		if(top == null) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		StackTest s = new StackTest();
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		
	}
}
