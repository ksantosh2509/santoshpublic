package training.java.first;

public class ArrayReturnEvenNum {

	
	public static int[] evenNum(int[] evennum)
	{
		int[] newArr ;
		
		int findlengh = 0 ;
		for(int i=0;i<evennum.length;i++)
		{
			if (evennum[i]%2 == 0)
			{
				findlengh++;
			}
			
		}
		
		newArr = new int[findlengh];
		int j=0;
		for(int i=0;i<evennum.length;i++)
		{
			if(evennum[i]%2==0)
			{
				newArr[j++] = evennum[i];
			}
		}
		
		return newArr;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] evenList = {1,2,3,4,5,6,7,8,9};
		
		int[] mainArray = evenNum(evenList);
		
		for(int n:mainArray)
		{
			
			System.out.println(n);
		}

	}

}
