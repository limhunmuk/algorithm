import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sorts {

	public static int[] bubbleSort(int[] arr) {
		// 6, 7, 1, 5
		// 67, 71 15
		// 67 71
		// 67
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<(arr.length-1)-i; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
		return arr;
	}
	
	public static int[] selectionSort(int arr[]) {
		int min;
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			for(int j=i; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
		return arr;
	}
	
	public static int[] insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			for(int j=i-1; j>=0; j--) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
		
		return arr;
	}
	
	public static void swap(int arr[] , int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	public boolean chkModStr(String str1, String str2) {
		
		return true;
	}
	
	public static String reverStr(String str) {
		StringBuffer sb = new StringBuffer(str).reverse();
		return sb.toString();
	}
	
	 public static int find(String s) {  
		  for(int i = s.length();;i++) {
		   boolean flag = true; 
		   for( int j =0; j < s.length(); j++) {
		      //반대쪽에 문자가 존재하는 데 다를 경우 플래그를 변경
		      if((i - j -1) < s.length() && s.charAt(j) != s.charAt(i-j-1)) {     
		            flag = false;
		           break;
		        }
		   }

		   if(flag) return i;
		  }
		 }
	
	
	public static void main(String[] args) {
		System.out.println("LHM TEST 11");
		int arr[] = {6,7,1,5};
		int rst[] = insertionSort(arr);
		for(int a : rst) {
			System.out.println(" >> " + a);
		}
		
		System.out.println(reverStr("가나다라"));
		
		String str = "나가다";
		char c1[] = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			System.out.println(" >> " + str.charAt(i));
		}
		
		String hh = "abab";
		int i= find(hh);
		System.out.println("회문 > " + i);
		
	}
}
