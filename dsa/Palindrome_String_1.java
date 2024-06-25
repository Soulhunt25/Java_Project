
package dsa;

import java.util.Scanner;


public class Palindrome_String_1 {

	static boolean compareString(String str) {
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

		System.out.println(compareString(str) ? "String is palindrome." : "String is not Palindrome.");
		
		sc.close();
	}
}

