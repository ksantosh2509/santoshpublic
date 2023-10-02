package second.java.programs;

public class MinMaxArray1708 {
	
	
	public static void main(String[] args) {
		
		int[] arr= {-2,33,1,2,54,67,-1};
		int min = 0,max=0;
		
		/*Initialize min and max values*/
		if(arr[0]>arr[1])
		{
			min=arr[1];
			max=arr[0];
		}
		else
		{
			min=arr[0];
			max=arr[1];
		}
		
		/*use min and max values in loop*/
		for(int i=2;i < arr.length;i++)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if (arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.println("min: "+min+"\n"+"max: "+max);
		
	}

}
