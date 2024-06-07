package string_questions;

import java.util.Scanner;

public class Q_50 {
	static boolean palindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();

		for (int i = 1; i <= str.length(); i++)
			for (int j = 0; j <= str.length() - i; j++) {
				String temp = str.substring(j, j + i);
				if (palindrome(temp)) {
					System.out.println(temp);
				}
			}
		sc.close();
	}
}
