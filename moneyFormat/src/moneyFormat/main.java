package moneyFormat;

import java.util.HashMap;
import java.util.HashSet;

public class main {
	
	private static String formatMoney(String str) {
		
		int pront  = str.length() % 3;
		int mock = str.length()/3;
		String head = str.substring(0, pront);
		for(int i=0;i<mock;i++) {
			head += "," + str.substring(pront, pront+3);
		}
		return head;	
	}
	
	public static void main(String[] args) {
		String str = "1000000";
		String rtn = formatMoney(str);
		
		HashSet<Integer> h = new HashSet<>();
		while(h.size() <= 10) {
			int data = (int)(Math.random() * 10);
			if(!h.equals(data)) h.add(data);
		}
		
		h.stream().forEach(i->{
			System.out.println("LHM TEST > " + i);
		});
		
	}

}
