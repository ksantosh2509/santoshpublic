package training.java.first;

public class SubStringInterview {

	public static void main(String[] args) {
		String str1 = "aabbcbbaccbbvbbbbbb";
		String str2 = "bb";
		int count = 0;
		// System.out.println(str1.toUpperCase()+" "+str2.toUpperCase());
		for (int i = 0; i <= str1.length(); i++) {
			if (str1.substring(i).startsWith(str2)) {
				count = count + 1;
			}

		}
		System.out.println(count);
	}

}
