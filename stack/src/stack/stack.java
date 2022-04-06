package stack;

public class stack {

	private int top = -1;
	private int arr[] = null;
	
	public stack(int size) {
		arr = new int[size];
	}
	
	//pop ²¨³»±â
	//push ³Ö±â
	
	void push(int data) {
		this.arr[++top] = data;
	}
	
	int pop() {
		return this.arr[top--];
	}
	
	int peek() {
		System.out.println("STACK PEEK > " + this.arr[top]);
		return this.arr[top];
	} 
	
	void printStackAll() {
		for(int data : arr) {
			System.out.println(data);
		}
	}
	
	
	
	
}
