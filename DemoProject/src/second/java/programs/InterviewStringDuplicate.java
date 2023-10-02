package second.java.programs;

public class InterviewStringDuplicate {
	
	public static void main(String[] args) 
	
	{
		//Java has ooops concepts
		
		String str = "Java has ooops concepts";
		
		String[] str1 = str.split(" ");
		String str2="";
		
		
	
		for(int i=0;i<str1.length;i++)
		{
			//System.out.println(str1[i]);
			String str3=str1[i];
			for(int j=0;j<str3.length();j++)
			{
				//System.out.println(str3.charAt(j));
				for(int k=j+1;k<str3.length();k++)
				{
					if (str3.charAt(j)== str3.charAt(k))
					{
						
						
						str2=str2+str3.charAt(j);
					}
										
				}
				
				if (str2.indexOf(str3.charAt(j)) == -1)
				{
					System.out.print(str3.charAt(j));
				}
	
			}
			
			System.out.print(" ");
			str2="";
		}
		
	}

}
