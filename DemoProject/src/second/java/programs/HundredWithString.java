package second.java.programs;

public class HundredWithString {

	public static void main(String[] args) {
		
		
		
		for(int i=1;i<=100;i++)
		{
			if ((i==3) || (i>=13 && i%10==3))
			{
				System.out.println("car");
			}
			
			else if((i==5) || (i>=15 && i%10==5))
			{
				System.out.println("Bus");
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
