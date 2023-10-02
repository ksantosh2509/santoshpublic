package training.java.first;

public class LongSubString {

	public static void main(String[] args) {
		String str = "javaconceptoftheday";
		// System.out.println(str.substring(1));
		String[] strNew = str.split("");
		String str2 = "";
		String str3 = "";
		String[] str4 = new String[strNew.length];
		String str5 = "";
		
		for (int i = 0; i < strNew.length; i++) {

			String[] str1 = str.substring(i).split("");

			for (int j = 0; j < str1.length; j++) {
				if (!(str2.contains(str1[j]))) {
					str2 = str2 + str1[j];
				}

				else {
					// str2 = str2+strNew[j];
					break;
				}
			}

			if (str3.length() > str2.length()) {
				// System.out.println(str3.length());
				str4[i] = str3;
			}
			str3 = str2;
			// System.out.println("Substring: "+ str2+ " Length: "+str2.length());
			str2 = "";
		}

		for (int k = 0; k < str4.length; k++) {

			if ((str4[k] != null) && (str4[k].length() > str5.length())) {
				str5 = str4[k];

			}

		}
		System.out.println("Longest Substring: " + str5 + " with length: " + str5.length());

	}

}
