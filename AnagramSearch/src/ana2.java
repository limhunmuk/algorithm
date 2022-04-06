import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ana2 {
	Map<String, List<String>> lookup = new HashMap<>();
	
	public ana2(List<String> words) {
		for(String word : words) {
			
			String signature = alphabetize(word);
			if(lookup.containsKey(signature)) {
				lookup.get(signature).add(word);
			}else {
				List<String> anagramList = new ArrayList<>();
				anagramList.add(word);
				lookup.put(signature, anagramList);
			}
		}
	}
	
	private String alphabetize(String word) {
		byte[] b = word.getBytes();
		Arrays.sort(b);
		return new String(b);
	}
	
	public List<String> getAnagrams(String word){
		String signature = alphabetize(word);
		List<String> anagrams = lookup.get(signature);
		return anagrams == null ? new ArrayList<String>() : anagrams;
	}
	
	//대체 이게 뭔코드야 짜도 이해가 안되네 미친책새끼
	public static void main(String[] args) {
		ana2 ana2 = new ana2(Arrays.asList("apple"));
		List<String> list = ana2.getAnagrams("angle");
		for(String str : list) {
			System.out.println(" >> " + str);
		}
	}
	
}
