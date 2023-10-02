package training.java.first;

import java.util.ArrayList;
import java.util.List;

public class LongPolyndromeSubstringList {

	public void longPolyndromeSubstring(String s) {

		String str2 = "";
		int count = 0;

		List<String> arrlist = new ArrayList<String>();
		int listlen = 0;
		String strMax = "";

		boolean b = true;
		for (int i = 0; i < s.length(); i++) {
			for (int j = count; j < s.length(); j++) {
				str2 = str2 + s.charAt(j);
				// System.out.println(str2);

				// System.out.println(str2.charAt(fwd));
				int fwd = 0, bwd = str2.length() - 1;
				while ((fwd <= bwd) && (b)) {
					if (str2.charAt(fwd) != str2.charAt(bwd)) {
						b = false;
						break;
					}
					fwd++;
					bwd--;

				}
				if ((b) && str2.length() > 1) {
					// System.out.println("Longest Substring from:" + " " + s + " is" + " " + str2);
					arrlist.add(str2);
				}
				b = true;
			}
			// System.out.println(str2);
			str2 = "";
			count++;
		}
		// System.out.println(strArray[0]);
		// String[] arrStr = new String[arrlist.size()];
		// arrlist.toArray(arrStr);

		for (String i : arrlist) {
			if (i.length() > strMax.length()) {
				listlen = i.length();
				strMax = i;
			}
		}

		System.out.println(strMax + " ----------->  " + listlen);

	}

	public static void main(String[] args) {

		LongPolyndromeSubstringList lp = new LongPolyndromeSubstringList();
		lp.longPolyndromeSubstring("babad");
		lp.longPolyndromeSubstring("cbbd");
		lp.longPolyndromeSubstring("dalayalam");
	}

}
