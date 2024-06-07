package string_questions;

import java.util.Scanner;

public class Q_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		int count = 0;
		for(char c : str.toCharArray()) {
			count++;
		}
		
		System.out.println("The no. of character in the String is : " + count);
		
		sc.close();
	}
}
