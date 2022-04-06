package queue;

import java.util.LinkedList;
import java.util.List;

public class QueueLinkedList {
	int rear=-1;
	List<Character> arr;
	public QueueLinkedList() {
		arr = new LinkedList<>();
	}
	
	void remove() {
		arr.remove(0);
	}
	
	void insert(char c) {
		arr.add(++rear, c);
	}
	
	int peek() {
		System.out.println("peek > " + arr.get(0));
		return arr.get(0);
	}
	
	void printArr() {
		StringBuffer sb = new StringBuffer();
		for(char data : arr) {
			sb.append(data + ", ");
		}
		System.out.println("printArr >> " + sb.toString());
	}
	
	public static void main(String[] args) {
		QueueLinkedList qt = new QueueLinkedList();
		qt.insert('6');
		qt.insert('7');
		qt.insert('1');
		qt.insert('5');
		
		qt.printArr();
		qt.remove();
		qt.remove();
		qt.printArr();
		qt.peek();
		qt.printArr(); 
	}
	
}
