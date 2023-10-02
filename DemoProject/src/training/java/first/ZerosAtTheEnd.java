package training.java.first;

public class ZerosAtTheEnd {
	
	

	public static String zeroAtTheEnd(String str1)
	{
		String str2 = "";
		
		for(int i=0;i<str1.length();i++)
		{
			if (str1.charAt(i) != '0') {
				str2 = str2 + str1.charAt(i);
			}
			
		}
		
		for(int i=0;i<str1.length();i++)
		{
			if (str1.charAt(i) == '0') {
				str2 = str2 + str1.charAt(i);
			}
		}
		
		return str2;
		
	}
	
	public static void main(String[] args) {
		//I/p: 12300004
		//O/p:12340000
		
		String str3 = zeroAtTheEnd("12300004");
		String str4 = zeroAtTheEnd("120034050607");
		String str5 = zeroAtTheEnd("010312");
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		
		
		

	}

}
