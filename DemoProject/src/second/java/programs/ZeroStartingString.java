package second.java.programs;

public class ZeroStartingString {

	public static void main(String[] args) {
		// String str="32400121200"
		// Output should be: 00003241212 
		
		String str="32400121200";
		String str1="";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)=='0')
			{
				str1=str1+str.charAt(i);
			}
			else
			{
				str2=str2+str.charAt(i);
			}
		}
		
		str1=str1+str2;
		System.out.println(str1);

	}

}
