package numberPrograms;

import java.util.Scanner;

public class HCF {

	static int hcf(int num_1, int num_2) {
		int max = 0;

		if (num_1 < num_2) {
			for (int i = 1; i <= num_1; i++) {
				if (num_1 % i == 0 && num_2 % i == 0) {
					max = Math.max(max, i);
				}
			}
			return max;
		}
		if (num_1 > num_2) {
			for (int i = 1; i <= num_2; i++) {
				if (num_1 % i == 0 && num_2 % i == 0) {
					max = Math.max(max, i);
				}
			}
			return max;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first no. : ");
		int num_1 = sc.nextInt();

		System.out.print("Enter second no. : ");
		int num_2 = sc.nextInt();

		int result = hcf(num_1, num_2);

		System.out.println("HCF of the is : " + result);

		sc.close();
	}

}
