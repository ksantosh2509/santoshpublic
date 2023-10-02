package training.java.first;

public class RemoveVowelsFromString {
	
	public static String removeVowel(String str1)
	{
		String[] str1New = str1.split("");
		String strTemp = "aeiou";
		String str2 = "";
		for(int i=0; i<str1New.length; i++)
		{
			if (!(strTemp.contains(str1New[i].toLowerCase())))
				
			{
				//System.out.print(str1New[i]);
				str2 = str2+str1New[i];
			}
		}
		return str2;
	}
	
	
	public static void main(String[] args) {
		
		String obj = removeVowel("Java Concept Of The Day");
		System.out.println(obj);

	}

}
