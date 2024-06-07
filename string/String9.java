// Write a program to convert string into integer and vice versa

package string;

import java.util.Scanner;

public class String9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.println(Integer.parseInt(str));
		sc.close();
	}
}
