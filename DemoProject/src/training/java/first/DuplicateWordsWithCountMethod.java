package training.java.first;

public class DuplicateWordsWithCountMethod {

	String str2 = "";
	int count = 1;

	public void inputStr(String str) {
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {

			if (str2.toLowerCase().contains(str1[i].toLowerCase())) {
				continue;
			}
			str2 = str2 + str1[i];

			for (int j = i + 1; j < str1.length; j++) {
				// if (str1[i].equalsIgnoreCase(str1[j])) {
				if (str1[i].toLowerCase().equalsIgnoreCase(str1[j].toLowerCase())) {

					count = count + 1;

				}

				// System.out.println(str1[i]);
			}

			if (count > 1) {
				System.out.println("Duplicate word count in: " + str + " " + "is" + " " + "\n" + "String Name: "
						+ str1[i] + " " + "And Count " + count);

			}
			count = 1;

		}

	}

	public static void main(String[] args) {

		DuplicateWordsWithCountMethod obj = new DuplicateWordsWithCountMethod();
		obj.inputStr("Java is java again java");
		obj.inputStr("Super Man Bat Man Spider Man super");
		obj.inputStr("Bread butter and bread");

	}

}
