package numberPrograms;

import java.util.Scanner;

public class Armstrong_num {
	
	static int count_num(int num) {
		int count = 0;
		
		while(num != 0) {
			int remainder = num % 10;
			count++;
			num /= 10;
		}
		return count;
	}
	
	static int Sum(int num) {
		int sum = 0;
		int temp = num;
		while(num > 0) {
			int rem = num % 10;
			sum = sum + (int)Math.pow(rem,count_num(temp));
			num /= 10;
		}
		return sum;
	}
	
	static boolean isArmstrong(int num) {
		if(Sum(num) == num) {
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to check Armstrong : ");
		int num = sc.nextInt();
		
		System.out.println(isArmstrong(num) ? "It's a Armstrong number" : "It's not an Armstrong number");
		
		sc.close();
	}

}
