package second.java.programs;

public class LargestNumber1408 {
	
	static int lar=0;
	
	public static void main(String[] args) {
		
		LargestNumber1408 ln = new LargestNumber1408();
		int arr[]=new int[4];
		arr[0]=3;
		arr[1]=44;
		arr[2]=57;
		arr[3]=8;
		System.out.println(ln.inputNumber(arr));
		
		
		/*char[] numbers = {33,1,15,77,9};
		
		for(int i=0;i<numbers.length;i++)
		{
				if(lar<numbers[i])
				{
					lar = numbers[i];
				}
			
		}
		
		System.out.println(lar);*/

	}

	int inputNumber(int[] numb)
	{
		for(int i=0;i<numb.length;i++)
		{
			if(lar<numb[i])
			{
				lar=numb[i];
			}
		}
		return lar;
	}
	
}
