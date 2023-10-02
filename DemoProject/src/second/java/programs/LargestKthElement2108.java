package second.java.programs;

import java.util.Arrays;

public class LargestKthElement2108 {

	public static void main(String[] args) {
		int [] nums = {3,2,3,1,2,4,5,5,6};		
		LargestKthElement2108 lke = new LargestKthElement2108();
		System.out.println(lke.largestKthElement(nums, 4));

	}
	
	int largestKthElement(int[] nums, int k)
	{
		Arrays.sort(nums);
		return nums[nums.length-k];
	}

}
