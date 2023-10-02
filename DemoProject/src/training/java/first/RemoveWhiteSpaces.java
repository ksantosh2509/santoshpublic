package training.java.first;

public class RemoveWhiteSpaces {
	
	public void removeWhiteSpace(String str)
	{
		//OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End
		
		String newStr = str.replaceAll("\\s+", "");
		System.out.println(newStr);
	}
	
	public void removeWhiteSpaceLoop(String str)
	{
		String[] strSplit = str.split("");
		String st = "";
		for(int i=0;  i<strSplit.length;i++)
		{
			if (!(strSplit[i].contains(" ")))
			{
				st=st+strSplit[i];
			}
		}
		System.out.println(st);
	}

	public static void main(String[] args) {
		RemoveWhiteSpaces rws = new RemoveWhiteSpaces();
		rws.removeWhiteSpace("OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End");
		rws.removeWhiteSpaceLoop("OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End      santosh");

	}

}
