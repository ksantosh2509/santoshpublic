package collection.practice.programs;

import java.util.LinkedList;



public class ListToArray {

	public static void main(String[] args) {
		
		 LinkedList<Integer> list = new LinkedList<Integer>();
		 list.add(100);
		 list.add(0, 200);
		 list.addFirst(300);
		 list.addLast(400);
		 
		 System.out.println(list);
		 
		 System.out.println((list.toArray())[1]);
		 

	}

}
