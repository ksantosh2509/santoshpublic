package training.java.first;

public class ReverseString {
	//MyJava
	
	
	
	public void reverString(String str)
	{
		// Using String Buffer
		StringBuffer str1 = new StringBuffer(str);
		System.out.println("String Buffer "+str1.reverse());
		
		//Using For loop
		System.out.print("With Loop "+ "  ");
		for(int i = str.length()-1;i >= 0;i--)
		{
			System.out.print(str.charAt(i));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		rs.reverString("MyJava");
	}

}
