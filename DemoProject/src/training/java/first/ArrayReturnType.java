package training.java.first;

import java.lang.reflect.Array;

public class ArrayReturnType {
	
	int[] intArray = {1,2,3,4,5};
	
	public int[] arrayReturnType()
	{
		
		Array.setInt(intArray, intArray.length-1, 6); 
		return intArray;
		
	}

	public static void main(String[] args) {
		
			ArrayReturnType art = new ArrayReturnType();
			int[] intArray = art.arrayReturnType();
			
			for(int a :intArray)
			{
				System.out.println(a);
			}
	}

}
