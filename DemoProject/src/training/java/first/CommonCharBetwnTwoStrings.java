package training.java.first;

import java.util.Arrays;

public class CommonCharBetwnTwoStrings {

	public void commonChar(String str1, String str2) {
		String[] str1New = str1.replaceAll("\\s+", "").split("");
		String str3 = "";

		for (int i = 0; i < str1New.length; i++) {
			if (!(str3.contains(str1New[i]))) {
				if (str2.contains(str1New[i])) {
					str3 = str3 + str1New[i];
				}
			}
		}
		char[] str3Char = str3.toCharArray();
		Arrays.sort(str3Char);
		for (char c : str3Char) {
			System.out.print(c);
		}
		
		// System.out.println(str1New[0] + "\n" + str2New[0]);
	}

	public static void main(String[] args) {
		CommonCharBetwnTwoStrings ccbts = new CommonCharBetwnTwoStrings();
		// ccbts.commonChar("thick bricks", "thin sticks");

		ccbts.commonChar("thick bricks", "thin sticks");

	}

}
