package training.java.first;

import java.util.Arrays;

public class Anagram {

	public void anagram(String str, String str1) {
		String strnew = str.replaceAll("\\s+", str);
		String str1new = str1.replaceAll("\\s+", str1);

		if (strnew.length() != str1new.length()) {
			System.out.println("Not a Anagram as length is not matching");
		} else {
			char[] ch = str.toLowerCase().toCharArray();
			char[] ch1 = str1.toLowerCase().toCharArray();

			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			boolean str3 = Arrays.equals(ch, ch1);
			
			if (str3)
			{
				System.out.println(str + " Anagram " + str1);
			} 
			else 
			{
				System.out.println("Not a Anagram");
			}

		}

	}

	public void anagramLoop(String str, String str1) {
		String strnew = str.replaceAll("\\s+", "").toLowerCase();
		String strnew1 = str1.replaceAll("\\s+", "").toLowerCase();

		char[] strnewArray = strnew.toCharArray();

		boolean status = true;

		if (strnew.length() == strnew1.length()) {
			for (char c : strnewArray) {
				int index = strnew1.indexOf(c);

				if (index != -1) {
					strnew1 = strnew1.substring(0, index) + strnew1.substring(index + 1, strnew1.length());
				}

				else {
					status = false;
				}
			}

			if (status == true) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not a Anagram");
			}
		}

		else {
			System.out.println("Not a anagram as length is not matching");
		}

	}

	public static void main(String[] args) {

		Anagram ag = new Anagram();
//		ag.anagram("spar", "rasp");
//		ag.anagram("School Master", "The Classroom");
//		ag.anagram("Debit Card", "Bad Credit");

		ag.anagramLoop("spar", "rasp");
		ag.anagramLoop("School Masters", "The Classrooms");
		ag.anagramLoop("Debit Card", "Bad Credit");

	}

}
