package training.java.first;

public class SwapTwoStrings {
	
	
	public void swapTwoString(String str1, String str2)
	{
		str1 = str1 + str2 ;
		str2 = str1.substring(0,(str1.length()-str2.length()));
		str1 = str1.substring(str2.length());
		System.out.println(str2);
		System.out.println(str1);
	}

	public static void main(String[] args) {
		
		SwapTwoStrings sts = new SwapTwoStrings();
		sts.swapTwoString("Santosh", "Kumar");
	}

}
