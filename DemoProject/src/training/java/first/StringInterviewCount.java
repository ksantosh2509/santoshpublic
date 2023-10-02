package training.java.first;

public class StringInterviewCount {

	public static void main(String[] args) {
		// Demo

		String str1 = "Demo";
		String[] str2 = str1.split("");

		for (String ch : str2) {
			// System.out.println(str1.indexOf(ch));

			int index = str1.indexOf(ch) + 1;

			System.out.print(ch.repeat(index));
		}

	}

}
