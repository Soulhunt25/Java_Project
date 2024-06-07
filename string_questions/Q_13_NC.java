package string_questions;

import java.util.Scanner;

public class Q_13_NC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.print("Enter the regular expression : ");
		String str_1 = sc.nextLine();		
		
		System.out.print("Enter the replacement string : ");
		String str2 = sc.nextLine();
		
		System.out.println(str.replaceAll(str_1, str2));
		
		sc.close();
	}
}
