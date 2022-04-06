import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
	
	public static List<Integer> getList(){
		List<Integer> numList = new LinkedList<Integer>();
		numList.add(1);
		numList.add(15);
		numList.add(3);
		numList.add(4);
		numList.add(5);
		numList.add(7);
		numList.add(2);
		numList.add(10);
		
		return numList;
	}
	
	public static int getMaxIntData(Stream<Integer> streamList) {
		return streamList.reduce(Integer::max).get();
	}
	
	public static List<Integer> getSortList(Stream<Integer> streamList) {
		return streamList.sorted().collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		String strArry[] = {"가", "나", "다", "나"};
		List<String> strList = Arrays.asList(strArry);
		
		Arrays.sort(strArry);
		Collections.sort(strList);
		
		for(String str1 : strArry) {
			System.out.println("strArry > " + str1);
		}
		
		for(String str1 : strList) {
			System.out.println("strList > " + str1);
		}
		
		//Stream 사용
		Stream<String> arrStream = Arrays.stream(strArry);
		Stream<String> listStream = strList.stream();
		
		System.out.println("----------");
		arrStream.sorted().forEach(System.out::print);
		System.out.println("----------");
		listStream.sorted().forEach(System.out::print);
		
		List<Integer> numList = getList();
		int maxData = getMaxIntData(numList.stream());
		System.out.println("max data  >> " + maxData);
		
		List<Integer> numSortList = getSortList(numList.stream());
		
		System.out.println("sort max data  1>> " + numSortList.get(numSortList.size()-1));
		System.out.println("sort max data  2>> " + numSortList.get(numSortList.size()-2));
		System.out.println("sort max data  3>> " + numSortList.get(numSortList.size()-3));
		
		StreamMain f = new StreamMain();
		
		int n2 =f.callFibo(5);
		System.out.println("LHM TEST > " + n2);
		
	}
	
//	private Map<Integer, Integer> hMap = new HashMap<>();
	private Map<Integer, Integer> hMap = new HashMap<>();
	public int callFibo(int n) {
		 if(n < 0) throw new IllegalArgumentException("n must not be less than zero");
		 hMap.put(0, 0);
	        hMap.put(1, 1);
	        return recursiveCachedFibN(n);
	}
	
	private int recursiveCachedFibN(int n) {
		if(hMap.containsKey(n))
            return hMap.get(n);
			
		int value = recursiveCachedFibN(n-1) + recursiveCachedFibN(n-2);
		hMap.put(n, value);
        return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
