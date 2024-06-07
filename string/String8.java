package string;

import java.util.Scanner;

public class String8 {

//	static String reverseString(String str) {
//		String newStr = "";
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			char ch = str.charAt(i);
//			newStr += ch;
//		}
//		return newStr;
//	}
	
	static boolean compareString(String str) {
		int i = 0;
		int j = str.length() - 1;
		
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
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