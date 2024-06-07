package string;

import java.util.Scanner;

public class String2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String n = sc.nextLine();
		
		int count= 0; 
		for(char ch : n.toCharArray()) {
			count++;
		}
		System.out.println(count);
		
		sc.close();

	}
}
