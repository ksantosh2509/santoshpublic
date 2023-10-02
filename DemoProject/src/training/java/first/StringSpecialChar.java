package training.java.first;

public class StringSpecialChar {

	public static void main(String[] args) {
		String inputStr = "$aggh#h&jjjn$";
		System.out.println(inputStr.length());
		int j = 0;
		char[] inputChar = inputStr.toCharArray();

		char[] outputChar = new char[inputStr.length()];
		for (int i = inputStr.length() - 1; i >= 0; i--) {

			if (!Character.isAlphabetic(inputChar[i])) {
				outputChar[i] = inputChar[i];
				j++;

			} else {
				outputChar[j] = inputChar[i];
				j++;
			}

		}
		System.out.println(outputChar);

	}

}
