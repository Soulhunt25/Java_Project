package string;

import java.util.Scanner;

public class String3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String n = sc.nextLine();
		
		System.out.println(n);
		System.out.println(n.toUpperCase());
		System.out.println(n.toLowerCase());
		
		sc.close();

	}

}
