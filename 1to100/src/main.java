
public class main {

	private static int addToNumbers(int s, int e){
		return (s+e-1)*(s+e)/2;
	}
	public static void main(String arg[]) {
		int sum = addToNumbers(1, 9);
		System.out.println("sum > " + sum);
		
		int sum2 = 0;
		for(int i=1; i<=9; i++) {
			sum2 = sum2+i; 
		}
		System.out.println("sum > " + sum);
		
	}
}
