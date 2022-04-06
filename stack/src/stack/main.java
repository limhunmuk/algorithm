package stack;

public class main {
	
	public static void main(String[] args) {
		//stack st = new stack(10);
		LinkedListStack st = new LinkedListStack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.peek();
		st.pop();
		st.peek();
		st.push(5);
		st.peek();
		st.printStackAll();
	}
}
