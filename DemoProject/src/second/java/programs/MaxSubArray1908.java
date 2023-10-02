package second.java.programs;

public class MaxSubArray1908 {

	public static void main(String[] args) {
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4}	;
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
				
			}
			if(sum>max)
			{
				max=sum;
			}
			
				sum=0;
			
			
		}
		System.out.println(max);

	}

}
