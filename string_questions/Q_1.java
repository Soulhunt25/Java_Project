package string_questions;

import java.util.Scanner;

public class Q_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entar a String : ");
		String s = sc.nextLine();
		
		System.out.print("Enter the index : ");
		int index = sc.nextInt();
		
		System.out.println(index >= 0 || index <= s.length() ? "Character present at index : "+s.charAt(index) : "Index out of bound");
		
		sc.close();
	}
}
