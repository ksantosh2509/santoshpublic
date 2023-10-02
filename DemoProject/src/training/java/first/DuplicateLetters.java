package training.java.first;

public class DuplicateLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sannttoshh";
		
		char[] strChar = str.toCharArray();
		 
	
		for(int i=0; i < str.length(); i++)
		{
			for(int j=i+1; j < str.length(); j++)
			{
				if (strChar[i] == strChar[j])
				{
					System.out.println(strChar[j]);
				}	
			}
			
		}

	}

}
 