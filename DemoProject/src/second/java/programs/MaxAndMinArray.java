package second.java.programs;

public class MaxAndMinArray {

	public static void main(String[] args) {
		//int[] a = {3, 5, 4, 1, 9};
		int[] a = {3};
		int max=0;
		int min=0;
	
		System.out.println(a.length);
		
		for(int i:a)
		{
		
			if(max<i)
			{
				max=i;
			}
			
			else
			{
			min=i;	
			}
		
		}
		System.out.println(max);
		System.out.println(min);

	}

}
