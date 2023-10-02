package training.java.first;

public class AllSubstringsOfString {
	
	
	public void allSubstrings(String str)
	{
		
		String[] strNew = str.split("");
		 String str1 = "";
		 int count=0;
		for(int i=0;i<strNew.length;i++)
		{
			for(int j=count;j<strNew.length;j++)
			{
				str1 = str1+strNew[j];
				System.out.println(str1);
			}
			str1="";
			count++;
			
						
		}
	}

	public static void main(String[] args) {
		AllSubstringsOfString asof = new AllSubstringsOfString();
		asof.allSubstrings("Java");

	}

}
