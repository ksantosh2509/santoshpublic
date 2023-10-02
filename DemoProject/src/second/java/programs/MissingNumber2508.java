package second.java.programs;

public class MissingNumber2508 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,8,9,11};
		missingNumber(arr);

	}

	private static void missingNumber(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			j=j+1;
			if(arr[i]!=j)
			{
				
				System.out.println(j);
				j=j+1;
			}
		}
		
	}

}
