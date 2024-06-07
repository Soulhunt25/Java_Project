package string_questions;

import java.util.Scanner;

public class Q_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		
		System.out.print("Enter the index : ");
		int n = sc.nextInt();
		
		System.out.print("Enter the character : ");
		char c = sc.next().charAt(0);
		
		sb.insert(n, c);
		System.out.println(sb);
		
		sc.close();
	}
}
