package string_questions;

import java.util.Scanner;

public class Q_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		byte[] s = str.getBytes();
		
		for(int i : s) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
