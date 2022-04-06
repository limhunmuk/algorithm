import java.util.Arrays;

public class ana {
	
	public static boolean anagram(String s1, String s2){
		
		char[] c1 = s1.toUpperCase().toCharArray();
		char[] c2 = s2.toUpperCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String cvt1 = new String(c1);
		String cvt2 = new String(c2);
		
		if(cvt1.equals(cvt2)) {
			System.out.println("anagram ok !!");
			return true;
		}else {
			System.out.println("anagram no !!");
			return false; 
		}
	}
	public static void main(String[] args) {
		anagram("abc", "bca");
		anagram("aac", "aca");
		anagram("abc", "abbc");
		String s = inPlaceReverse("家林茄捍父林家");
		System.out.println(">> " + s);
	}
	
	public static String inPlaceReverse(final String s) {
		final StringBuilder sb = new StringBuilder(s);
		for(int i=0;  i< sb.length()/2; i++) {
			final char tmp = sb.charAt(i);
			final int otherEnd = sb.length()-i-1;
			sb.setCharAt(i, sb.charAt(otherEnd));
			sb.setCharAt(otherEnd, tmp);
		}
		return sb.toString();
	}
}
