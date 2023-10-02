package training.java.first;

public class StringHiThisismyfirstprogram {

	public String str;
	String str1 = "";

	public StringHiThisismyfirstprogram(String str) {
		this.str = str;
	}

	public void stringReverse() {
		String[] strNew = str.split("");

		int l = 0, r = (strNew.length) - 1;

		while (l <= r) {
			if ((!(strNew[l].equals(" "))) && (!(strNew[r].equals(" ")))) {
				str1 = strNew[l];
				strNew[l] = strNew[r];
				strNew[r] = str1;
				l++;
				r--;
			} else if (strNew[l].equals(" ")) {
				l++;
			} else {
				r--;
			}
		}

		for (String i : strNew) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		// Hi This is my first program
		// ma rgor pt sr ifmys isihTiH

		StringHiThisismyfirstprogram st = new StringHiThisismyfirstprogram("Hi This is my first program");
		st.stringReverse();

	}

}
