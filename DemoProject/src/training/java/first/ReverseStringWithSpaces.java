package training.java.first;

public class ReverseStringWithSpaces {

	public void reverseStringWithSpaces(String str) {
		// I Am Not String
		// g ni rtS toNmAI
		System.out.println();
		char[] strNew = str.toCharArray();
		int count = 0;
		for (int c = strNew.length - 1; c >= 0; c--) {

			if (strNew[count] == ' ') {
				System.out.print(" ");

				c++;

			} 
			
			
			
			else {

				if (strNew[c] != ' ') {
					System.out.print(strNew[c]);

				}
				else
				{
					c--;
					System.out.print(strNew[c]);
				}
				
			}
			if (count < strNew.length - 1) {
				count++;
			}
		}

	}

	public static void main(String[] args) {
		ReverseStringWithSpaces rsws = new ReverseStringWithSpaces();
		rsws.reverseStringWithSpaces("I Am Not String");
		rsws.reverseStringWithSpaces("JAVA JSP ANDROID");
		rsws.reverseStringWithSpaces("1 22 333 4444 55555");

	}

}
