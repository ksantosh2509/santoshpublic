package training.java.first;

public class ThirdLetterReplaceInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr = "AEIUBCDM";
		//String input_str = "AEIUBCDMsantosh";

		char[] charConvert = inputStr.toCharArray();

		int i = 0;

		while (i < charConvert.length) {
			if (i + 2 >= charConvert.length) {
				break;
			}
			char temp = charConvert[i];

			charConvert[i] = charConvert[i + 2];
			charConvert[i + 2] = temp;
			i = i + 3;
		}
		System.out.println(charConvert);

	}

}
