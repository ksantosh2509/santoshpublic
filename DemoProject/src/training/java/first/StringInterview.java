package training.java.first;

public class StringInterview {
	static String ip3 = "";
	static String ip4 = "";

	public void stringReverse(String ip) {
		// String ip = "hello world";
		String[] ip2 = ip.split(" ");

		System.out.println(ip2.length);
		for (int i = 0; i < ip2.length; i++)

		{
			ip3 = ip3 + ip2[i].toUpperCase().charAt(0);

			for (int j = ip2[i].length() - 1; j > 0; j--) {

				ip4 = ip4 + ip2[i].charAt(j);

			}

			System.out.print((ip3 + ip4) + " ");
			ip4 = "";
			ip3 = "";

		}

	}

	public void moveZeroToEnding(int[] ip) {
		for (int i : ip) {
			if (i != 0) {
				System.out.print(i);
			}
		}
		for (int j : ip) {
			if (j == 0) {
				System.out.print(j);
			}
		}
	}

	public static void main(String[] args) {
		// String ip=hello world
		// String op- Holle Wdlro
		// Ip int[] a={1,2,0,6,7,0,8} op {1267800}

		StringInterview obj = new StringInterview();
		// obj.stringReverse("hello world");

		int[] a = { 1, 2, 0, 6, 7, 0, 8 };

		obj.moveZeroToEnding(a);

	}

}
