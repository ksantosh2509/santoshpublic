package training.java.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaximumOccurringChar {
	
	public void maximumOccChar(String str)
	{
		System.out.println();
		//Java Concept Of The Day
		String[] strNew = str.split("");
		String strTemp = "";
		int count=1;
		String c="";
		Map<String,Integer> hashmap = new HashMap<String,Integer>();
		
		for(int i=0; i< strNew.length;i++)
		{
			if ((!(strTemp.contains(strNew[i]))) && (!(strNew[i].contains(" "))))
			{	
				
			for(int j=i+1; j<strNew.length; j++)
			{
				if (strNew[i].equals(strNew[j]))
				{
					count++;
					strTemp = strTemp+strNew[i];
				}
			}
			//System.out.println(strNew[i]+" : "+ count);
			hashmap.put(strNew[i], count);
			
			count=1;
			}
		}
		//System.out.println(hashmap);
		for(Entry<String, Integer> entry:hashmap.entrySet())
		{
			//System.out.println(entry.getValue());
			if (entry.getValue() > count)
			{
				count = entry.getValue();
				c = entry.getKey();
			}
			
		}
		System.out.println(str+ "--->"+ " "+ c + " : "+count);
	}

	public static void main(String[] args) {
	MaximumOccurringChar moc = new MaximumOccurringChar();
	moc.maximumOccChar("Java Concept Of The Day");
	moc.maximumOccChar("Java J2ee Android Hibernate JSP");
	moc.maximumOccChar("abbcccddddeeeeeffffff");
	moc.maximumOccChar("122333444455555666666");
	}

}
