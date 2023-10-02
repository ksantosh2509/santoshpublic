package training.java.first;

public class SearchElementInArray {
	
	static int key1 = 0;
	
	public static void searchElementInArray()
	{
		int[] intArray = {5, 1, 1, 9, 7, 2, 6, 10};
		int key= 7;
		
		for(int c: intArray)
		{
			if (c==key)
			{
				System.out.println(key+" "+"is present in array");
			}
		}
		
	}
	
	public static int maxElementInArray(int[] arr)
	{
		for(int c:arr)
		{
			if (c>key1)
			{
				key1 = c;
			}
		}
		
		return key1;
		
	}
	
	public static void main(String[] args) {
		searchElementInArray();
		int[] arr = {5, 1, 1, 9, 7, 2, 6, 10};
		
		int returnKey = maxElementInArray(arr);
		System.out.println("Max value from input array is: "+returnKey);
	}

}
