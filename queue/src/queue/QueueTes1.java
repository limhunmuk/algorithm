package queue;

//성공버전
public class QueueTes1<T> {

	class Node{
		T data;
		Node next;
		
		Node(T data){
			this.data = data;
		}
	}
	
	Node first;
	Node last;
	
	void add(T data) {
		Node n = new Node(data);
		if(last != null) {
			last.next = n;
		}
		last = n;
		
		if(first == null) {
			first = last;
		}
	}
	
	T remove() {
		if(first == null) {
			System.out.println("에러");
		}
		
		T tmp = first.data;
		first = first.next;
		
		if(first == null) {
			last = null;
		}
		
		return tmp;
	}
	
	T peek() {
		if (first == null) {
			System.out.println("에러");
		}
		return first.data;
	}
	
	boolean isEmpty() {
		if(first == null) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		QueueTes1<Integer> q = new QueueTes1<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
	}
}
