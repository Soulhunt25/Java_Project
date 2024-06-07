package arrays;

import java.util.Scanner;

public class Each_word_in_String_reverse {

	static String wordReverse(String word) {
		String newStr = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			newStr += word.charAt(i);
		}

		return newStr;
	}

	static String reverse(String word) {
		String newstr = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			newstr += word.charAt(i);
		}

		return newstr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String str = sc.nextLine();

		String[] words = str.split(" ");
		
		StringBuilder reversedStr = new StringBuilder();

		for (String word : words) {
			reversedStr.append(wordReverse(word)).append(" ");
		}

		System.out.println("Reversed String: " + reversedStr.toString().trim());

		sc.close();
	}
}
