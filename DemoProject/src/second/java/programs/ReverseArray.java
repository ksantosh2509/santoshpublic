package second.java.programs;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int[] arr1= {1, 2, 3,4,5,6};
		int arr2[] = new int[arr1.length];
		
		//System.out.println(arr1[3]);
		
		for(int i=arr1.length-1;i>=0;i--)
		{
			//System.out.println(arr1[i]);
			
			arr2[(arr1.length-1)-i] = arr1[i];
				
		}
		
		for(int j:arr2)
		{
			System.out.println(j);
		}
		
		

	}

}
