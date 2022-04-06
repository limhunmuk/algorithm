package stack;

import java.util.Stack;

public class StackWithMin extends Stack<NodeWithMin> {

	private int min() {
		if(this.empty()) {
			return Integer.MAX_VALUE;
		}else {
			return peek().min;
		}
	}
	
	public void push(int value) {
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}
	
	public static void main(String[] args) {
		StackWithMin sm = new StackWithMin();
		sm.push(4);
		sm.push(1);
		sm.push(2);
		System.out.println("min > " + sm.min());
	}
}
