package training.java.first;

import java.text.DecimalFormat;



public class LettersPercentageInString {
	
	public void lettersPercentage(String str)
	{
		char[] strNew = str.toCharArray();
		float capitalCount=0f,smallCount=0f,digitCount=0f,specCount=0f;
		
		for(int i=0; i < strNew.length;i++)
		{
			if (strNew[i] >= 65 && strNew[i] <= 91)
			{
				//System.out.println(strNew[i]);
				capitalCount = capitalCount+1;
			}
			else if (strNew[i] >= 48 && strNew[i] <= 58)
			{
				//System.out.println(strNew[i]);
				digitCount = digitCount+1;
			}
			else if (strNew[i]>= 97 && strNew[i]<=123)
			{
				//System.out.println(strNew[i]);
				smallCount = smallCount+1;
			}
			else
			{
				//System.out.println(strNew[i]);
				specCount = specCount+1;
			}
		}
		//System.out.println(str.length());
		//System.out.println(capitalCount);
		
		DecimalFormat formatter = new DecimalFormat("##.##");
		
		System.out.println("Number of uppercase letters are"+" "+
		(int)capitalCount+". So, Percentage is"+" "+formatter.format((capitalCount/str.length())*100)+"%");
		System.out.println("Number of digits are"+" "+
				(int)digitCount+". So, Percentage is"+" "+formatter.format((digitCount/str.length())*100)+"%");
		System.out.println("Number of smallcase letters are"+" "+
				(int)smallCount+". So, Percentage is"+" "+formatter.format((smallCount/str.length())*100)+"%");
		System.out.println("Number of special cases are"+" "+
				(int)specCount+". So, Percentage is"+" "+formatter.format((specCount/str.length())*100)+"%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LettersPercentageInString lp = new LettersPercentageInString();
		lp.lettersPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
		lp.lettersPercentage("AUS : 123/3, 21.2 Overs");
	}

}
