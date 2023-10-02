package training.java.first;

public class Polyndrome {

	public static void poly(String str1) {
		String[] str1New = str1.split("");
		int forward = 0;
		int backward = str1New.length - 1;
		boolean status = true;

		while ((forward <= backward) && (status)) {
			if (!(str1New[forward].toLowerCase().equals(str1New[backward].toLowerCase()))) {
				status = false;

			}

			forward++;
			backward--;
		}

		if (status) {
			System.out.println("Polyndrome");
		} else {
			System.out.println("Not a polyndrome");
		}

	}

	public static void main(String[] args) {

		poly("Level");
	}

}
