package training.java.first;

public class ReverseEachWord {
	
	public void reverseEachWord(String str)
	{
		String[] strNew = str.split(" ");
		String strTemp="";
		
		for(int i=0;i<strNew.length;i++)
		{
			//System.out.println(strNew[i]);
			for(int j=strNew[i].length()-1;j>=0;j--)
			{
				//System.out.print(strNew[i].charAt(j));
				strTemp = strTemp+strNew[i].charAt(j);
			}
			System.out.print(strTemp);
			System.out.print(" ");
			strTemp="";
		}
	}

	public static void main(String[] args) {
		// Java Concept Of The Day
		
		 ReverseEachWord rew = new ReverseEachWord();
		 rew.reverseEachWord("Java Concept Of The Day");

	}

}
