package collection.practice.programs;

import java.util.ArrayList;

public class ArrayListProgram1 {

	
	
	public static void arrayList()
	{
		 ArrayList<String> arrList = new ArrayList<String>();
		 arrList.add("Santosh");
		 arrList.add("Divya");
		 arrList.add("Kalvakuntla");
		 
		 for( String arr :arrList)
		 {
			 System.out.println(arr);
		 }
		 
		 ArrayList<String> newList = new ArrayList<String>();
		 arrList.add(0, "NC");
		 arrList.add(1, "Exp:9");
		 newList.addAll(arrList); // Adding all elements from arrList to newList
		 System.out.println(arrList);
		 System.out.println(arrList.subList(1, 3));
		 System.out.println(newList);
	}
	
	
	public static void main(String[] args) {
		arrayList();

	}

}
