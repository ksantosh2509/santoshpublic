package second.java.programs;

public class MaxSubArray {

	public static void main(String[] args) {
		
		
		int[] nums= {5,4,-1,-7,8};
		int sum=0,count=Integer.MIN_VALUE;
		
		for(int i=0;i< nums.length;i++)
		{
			sum=sum+nums[i];
			if(count<sum)
			{
				count=sum;
			}
			if(sum<0)
			{
				sum=0;
			}
			
		}
		System.out.println(count);
		
		

	}

}
