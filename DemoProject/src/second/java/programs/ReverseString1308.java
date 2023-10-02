package second.java.programs;

public class ReverseString1308 {
	
	String str1="";
	
	String reverseString(String str)
	{
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		
		return str1;
	}
	
	String CharReverseString(String str)
	{
		str1="";
		char[] strChar = str.toCharArray();
		for(int i=strChar.length-1;i>=0;i--)
		{
			str1=str1+strChar[i];
		}
		return str1;
		
	}
	
	StringBuilder reverseStringBuild(String str)
	{
		StringBuilder sb = new StringBuilder();
		
		/*First we appended string to string builder object
		 then used reverse method to reverse the string*/
		return sb.append(str).reverse();
	}

	public static void main(String[] args) {
		
		ReverseString1308 rs = new ReverseString1308();
		
		System.out.println("reverseString     "+rs.reverseString("Santosh"));
		System.out.println("CharReverseString     "+rs.CharReverseString("Santosh"));
		System.out.println("StringBuilder     "+rs.reverseStringBuild("Santosh"));
	}

}
