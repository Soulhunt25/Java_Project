package string;

import java.util.Scanner;

public class String7 {

static String reverseString(String str) {
	String newStr = "";
	
	for(int i = str.length() - 1; i >= 0; i--) {
		char ch = str.charAt(i);
		newStr += ch;
	}
	return newStr;
}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		String revStr = reverseString(str);
		System.out.println("Reversed String is : " + revStr);
		
		sc.close();
	}
}
