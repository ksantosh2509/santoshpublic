package second.java.programs;

public class CommonElementsArrays2308 {

	public static void main(String[] args) {
		int[] arr1 = {4,7,3,9,2};
		int[] arr2 = {3,2,12,9,40,32,4};
		
		for(int i:arr1)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(i==arr2[j])
				{
					System.out.println("Common Elemenets between Arr1 and Arr2 are:    "+i);
				}
			}
		}

	}

}
