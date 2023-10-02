package training.java.first;

public class DuplicateCharactersWithCount {

	
	public void duplicateCharWithCount(String str)
	{
		String[] str1 = str.split("");
		String str2="";
		int count=1;
		System.out.println("Duplicate Characters In"+" "+str);
		for(int i=0;i<str1.length;i++)
		{
			if (!(str2.contains(str1[i])))
			{
				for(int j=i+1;j<str1.length;j++)
				{
					if (str1[i].equals(str1[j]))
					{
					count=count+1;	
					}
				}
				if (count > 1)
				{
					System.out.println(str1[i]+" "+":"+" "+ count);
				}
				
				count=1;
			}
			str2=str2+str1[i];
		}
		
	}
	
	public static void main(String[] args) {
		
		DuplicateCharactersWithCount dc = new DuplicateCharactersWithCount();
		dc.duplicateCharWithCount("Better Butter");
		dc.duplicateCharWithCount("JavaJ2EE");
		dc.duplicateCharWithCount("Fresh Fish");
		

	}

}
