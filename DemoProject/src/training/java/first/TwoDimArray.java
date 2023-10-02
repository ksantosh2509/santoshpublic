package training.java.first;

public class TwoDimArray {
	
	
	
	public static void main(String[] args) {
		String[][] stringArr = new String[2][2];
		
		stringArr[0][0] = "Santosh";
		stringArr[0][1] = "Kumar";
		stringArr[1][0] = "Kalvakuntla";
		stringArr[1][1] = "Divya";
		
		for(String r[]:stringArr)
		{
			for(String c:r)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}
