package string_questions;

import java.util.Scanner;

public class Q_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			System.out.println(c);
		}
		
		sc.close();
	}
}
