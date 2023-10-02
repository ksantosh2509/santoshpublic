package training.java.first;

public class StringInterviewRepeat {

	public static void main(String[] args) {
		//weelccoommee hhoommeee
		
		String str1 = "weelccoommee hhoommeee";
		String[] str2 = str1.split("");
		String str3=str2[0];
		String str4="";
		
		System.out.println(str2.length);
		for(int i=1;i<str2.length;i++)
		{
			
			  if  (!str2[i-1].equals(str2[i]))
			  { 
				  str3=str3+str2[i];
			  }
			
			
			if(!str4.endsWith(str2[i-1]))
			{
				str4=str4+str2[i-1];
			}
		}
		System.out.println(str3);
		  System.out.println(str4);

	}

}
