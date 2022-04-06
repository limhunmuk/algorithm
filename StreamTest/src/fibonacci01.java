import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fibonacci01 {

	public static List<Integer> fibonacci(int n){
		if(n<0) {
			return null;
		}
		
		if(n==0) {
			return Arrays.asList(0);
		}
		
		if(n==1) {
			return Arrays.asList(0,1);
		}
		
		final List<Integer> seq = new ArrayList<>(n);
		seq.add(0);
		n=n-1;
		seq.add(1);
		n-=1;
		
		while(n>0) {
			int a= seq.get(seq.size()-1);
			int b= seq.get(seq.size()-2);
			seq.add(a+b);
			n=n-1;
		}
		return seq;
	};
	
	public static int fibonacci2(int n){
		if(n<0) throw new IllegalArgumentException("에러에러");
		
		if(n==1) return 1;
		if(n==0) return 0;
		return fibonacci2(n-1) + fibonacci2(n-2);
	}
	
	private Map<Integer, Integer> fibCache = new HashMap<>();
	public int cachedFibN(int n) {
	        if(n < 0) throw new IllegalArgumentException("n must not be less than zero");
        fibCache.put(0, 0);
        fibCache.put(1, 1);
        return recursiveCachedFibN(n);
    }
	    
    private int recursiveCachedFibN(int n) {
        if(fibCache.containsKey(n))
            return fibCache.get(n);
        
        int value = recursiveCachedFibN(n-1) + recursiveCachedFibN(n-2);
        fibCache.put(n, value);
        return value;
    }

	
	public static void main(String[] args) {
		
		int seq = 3;
		List<Integer> list = fibonacci(seq);
		list.stream().forEach(p ->{System.out.print(p + " ");});
		int a = fibonacci2(seq);
		System.out.println("--");
		System.out.println("return >> " + a);
		System.out.println("--");
		
		// 최적화 캐쉬 피보나치
//		HashMap<Integer, Integer> hMap = new HashMap<>();
//		int b = cashFibonacci(5-1, hMap);
//		System.out.println("lhm test >" + b);
		
		fibonacci01 f = new fibonacci01();
		int n = f.cachedFibN(seq);
		System.out.println("LHM TEST > " + n);
		
//		int n2 =f.cashFibonacci(5);
//		System.out.println("LHM TEST > " + n2);
	}
}
