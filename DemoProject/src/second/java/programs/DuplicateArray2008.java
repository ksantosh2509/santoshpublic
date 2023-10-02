package second.java.programs;

import java.util.HashMap;

public class DuplicateArray2008 {

	public static void main(String[] args) {
		int arr[]= {1,1,1,3,3,4,3,2,4,2};
		boolean result = false;
		/*
		 * for(int i=0;i<arr.length;i++) { for(int j=i+1;j<arr.length;j++) {
		 * if(arr[i]==arr[j]) { result=true; break; } } } if(!result) { result=false; }
		 * System.out.println(result);
		 */	
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		 for (int i=0;i<arr.length;i++)
		 {
			 if(hm.containsKey(arr[i]))
			 {
				 result=true;
			 }
			 
			 hm.put(1, arr[i]); //inserting values to hashmap
		 }
		 if(!result)
		 {
			 result=false;
		 }
		 System.out.println(result);
	}

}
