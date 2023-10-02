package training.java.first;

public class CountLettersInWord {

	public void countLetterInWord(String str) {
		// aaaadddccca
		int count = 1;
		String str1 = "";
		String[] strNew = str.split("");

		for (int i = 0; i < strNew.length; i++) {
			if (!(str1.contains(strNew[i]))) {
				str1 = "";
				for (int j = i + 1; j < strNew.length; j++) {
					if (strNew[i].equals(strNew[j])) {
						count = count + 1;
						str1 = str1 + strNew[i];
					} else {
						break;
					}
				}
				System.out.println(strNew[i] + " : " + count);
				count = 1;
			}

		}
	}

	public static void main(String[] args) {
		CountLettersInWord cliw = new CountLettersInWord();
		cliw.countLetterInWord("aaaadddccca");

	}

}
