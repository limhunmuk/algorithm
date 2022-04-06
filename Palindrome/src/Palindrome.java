
public class Palindrome {

	public static boolean isPlaindrome(String s) {
		String toCheck = s.toLowerCase();
		int left =0;
		int right = toCheck.length()-1;
		
		while(left <= right) {
			while(left<toCheck.length() && 
					!Character.isLetter(toCheck.charAt(left))) {
				left++;
			}
			while(right>0 && !Character.isLetter(toCheck.charAt(right))) {
				right--;
			}
			
			if(left> toCheck.length() || right < 0) {
				return false;
			}
			
			if(toCheck.charAt(left) != toCheck.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		boolean f = isPlaindrome("lolb lol");
		System.out.println("LHM TEST > " + f);
		
		boolean f2 = reversePalindrome("lolb lol".replaceAll(" ", ""));
		System.out.println("LHM TEST > " + f2);
	}
	
	public static boolean reversePalindrome(String s) {
		return s.equals(reverseStr(s));
	}
	
	public static String reverseStr(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
}
