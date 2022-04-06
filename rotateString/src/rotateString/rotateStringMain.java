package rotateString;

import java.util.Stack;

public class rotateStringMain {

	public static void main(String[] args) {
		String inputStr = "家林茄捍父林家";
		char[] c = inputStr.toCharArray();
	
		Stack stack = new Stack();
		
		for(int i=0; i<c.length; i++) {
			stack.push(c[i]);
		}
		
		StringBuffer sb = new StringBuffer();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println("lhm test > " + sb.toString());
		
	}
		
}
