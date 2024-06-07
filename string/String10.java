package string;

import java.util.Scanner;

public class String10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		String str = String.valueOf(num);
		
		for (char ch: str.toCharArray()) {
			System.out.print(ch);
		}

		sc.close();
	}
}