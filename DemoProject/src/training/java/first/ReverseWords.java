package training.java.first;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		String str1 = "Java Concept Of The Day";
		
		String[] str2 = str1.split(" ");
		String str3 = "";
		
		for(int i=(str2.length-1);i>=0;i--)
		{
			str3 = str3 + str2[i]+" ";
		}
		System.out.println(str3);
	}
	
	

}
