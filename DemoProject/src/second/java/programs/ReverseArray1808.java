package second.java.programs;

public class ReverseArray1808 {

	public static void main(String[] args) {
		
		int[] arr = {11,2,33};
		int[] arr2= new int[arr.length];
				
		
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.println(arr[i]);
			arr2[arr.length-1-i]=arr[i];
			
		}
		for(int j:arr2)
		{
			System.out.println(j);
		}
		
	}

}
