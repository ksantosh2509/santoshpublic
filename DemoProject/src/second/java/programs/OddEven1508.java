package second.java.programs;

public class OddEven1508 {
	
	
	String oddEven(int num)
	{
		String result="";
		
		if((num%2)==0)
		{
			result="Even";
			//System.out.println("Even");
		}
		else
		{
			result="Odd";
			//System.out.println("Odd");
		}
		
		return result;
	}

	public static void main(String[] args) {
		OddEven1508 od = new OddEven1508();
		
		System.out.println(od.oddEven(99));
		System.out.println(od.oddEven(2));

				
	}

}
