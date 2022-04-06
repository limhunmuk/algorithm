package queue;

public class QueueTest {

	private int head=0;
	private int rear=-1;
	private int[] arr;
	
	QueueTest(int size){
		arr = new int[size];
	}
	
	void insert(int data) {
		arr[++rear] = data;
		System.out.println("queue insert rear > " + rear);
	}
	
	int peek() {
		System.out.println("queue peek() > " + arr[head]);
		return arr[rear];
	}
	
	void remove() {
		arr[head++] = -1;
		System.out.println("queue remove head > " +  head);
	}
	
	void printArr() {
		for(int data : arr) {
			System.out.println("queue : " + data );
		}
	}
	
	boolean isFull() {
		if(rear == arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean isEmpty() {
		if(head == rear+1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String arg[]) {
		QueueTest qt = new QueueTest(4);
		qt.insert(6);
		qt.insert(7);
		qt.insert(1);
		qt.insert(5);
		System.out.println("is full >" + qt.isFull());
		qt.remove();
		qt.remove();
		qt.remove();
		qt.remove();
		System.out.println("is empty >" + qt.isEmpty());
		qt.printArr();
		System.out.println("LHM TEST 큐테스트");
	}
	
}
