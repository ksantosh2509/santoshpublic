package training.java.first;

public class FirstReapeatCharacter {
	
	public void firstrepeatch(String str)
	{
		//santoshkumar
		
		String[] strNew = str.split("");
		
		String str1 = "";
		
		for(int i=0; i<strNew.length;i++)
		{
			if (!(str1.contains(strNew[i])))
			{
				str1 = str1+strNew[i];
			}
			else
			{
				System.out.println(strNew[i]);
				break;
			}
		
		}
		
		str1="";
		for(int i=0;i<strNew.length;i++)
		{
			if (str1.contains(strNew[i]))
			{
				str1 = str1+strNew[i];
			}
			else
			{
				System.out.println(strNew[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		FirstReapeatCharacter frc = new FirstReapeatCharacter();
		frc.firstrepeatch("FirstReapeatCharacter");

	}

}
