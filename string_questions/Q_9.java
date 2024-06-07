package string_questions;

import java.util.Scanner;

public class Q_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String : ");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();

		for (char c = 'a'; c <= 'z'; c++) {
			for (int i = 0; i <= ch.length - 1; i++) {
				if (ch[i] == c) {
					System.out.println("Character '" + c + "' found at index " + i);
				}
			}
		}

		sc.close();
	}
}
