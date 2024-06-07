package string_questions;

import java.util.Scanner;

public class Q_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1'st String : ");
		String str_1 = sc.nextLine();
				
		System.out.print("Enter the 2'nd String : ");
		String str_2 = sc.nextLine();
		
		System.out.println(str_1.compareTo(str_2));
		
		sc.close();
	}
}
