package numberPrograms;

import java.util.Scanner;

public class Decimal_BInary {
	
	
	static String conversion(int n) {
		
		String bin = "";
		
		while(n > 0) {
			int rem = n % 2;
			bin += rem;
			n /= 2;
		}
		
		return bin;
		
	}
	
	static int dec_to_bin(String bin) {
		String new_bin = "";
		
		for (int i = bin.length() - 1; i >= 0; i--) {
			new_bin += bin.charAt(i);
		}
		return Integer.parseInt(new_bin);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		String x = conversion(n);
		System.out.println(dec_to_bin(x));
		
		sc.close();
	}
}
