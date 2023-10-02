package com.selenium.test.testing;

public class WaitReview {

	public static void main(String[] args) {

		char a = 'A';
		int count = 0;
		System.out.println("*******Capital Letters***********");
		System.out.println(Integer.hashCode(a) + " " + a);

		for (int i = 1; i <= 26; i++) {
			System.out.println(Integer.hashCode(++a) + " " + a);
			if (i >= 25 && count < 1) {
				i = 1;
				a = 'a';
				System.out.println("*******Small Letters***********");
				System.out.println(Integer.hashCode(a) + " " + a);
				count++;
			}
		}

	}

}
