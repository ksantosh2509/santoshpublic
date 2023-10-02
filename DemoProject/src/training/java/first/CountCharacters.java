package training.java.first;

public class CountCharacters {
	// Java J2EE Java JSP J2EE

	public void countCharacter(String str) {
		int count = 1;
		String[] str1 = str.trim().split(" ");
		String str2 = "";
		String str4 = "";
		for (int i = 0; i < str1.length; i++) {
			// System.out.print(str1[i]);
			str2 = str2 + str1[i];

			// count=1;

		}
		// System.out.print(str2);
		String[] str3 = str2.split("");
		for (int j = 0; j < str3.length; j++) {
			if (!(str4.contains(str3[j]))) {
				for (int k = j + 1; k < str3.length; k++) {
					if (str3[j].equals(str3[k])) {
						count = count + 1;
					} else {
						// count=1;
					}

				}
				System.out.print(str3[j] + count + " ");
			}
			
			count = 1;
			str4 = str4 + str3[j];
		}

	}

	public static void main(String[] args) {
		CountCharacters cc = new CountCharacters();
		cc.countCharacter("Java J2EE Java JSP J2EE");

	}

}
