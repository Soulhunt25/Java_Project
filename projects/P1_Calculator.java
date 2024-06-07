package projects;

import java.util.Scanner;

public class P1_Calculator {

	static void basic_calculator(double n, char c, double a) {

		double result = 0;

		switch (c) {

		case '+':
			result = n + a;
			break;

		case '-':
			result = n - a;
			break;

		case '*':
			result = n * a;
			break;

		case '/':
			if (a != 0) {
				result = n / a;
			} else {
				System.out.println("Invalid : Division with zero.");
				return;
			}
			break;

		default:
			System.out.println("Invalid operation");
			return;
		}

		System.out.println("Result : " + result);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int b = 0;

		do {
			System.out.print("Enter 1 for starting calculator and 2 for exit : ");
			b = sc.nextInt();

			if (b == 1) {
				System.out.print("Enter the number : ");
				double n = sc.nextInt();

				System.out.print("Enter what you want to perform(+,-,*,/) : ");
				char c = sc.next().charAt(0);

				System.out.print("Enter the number : ");
				double a = sc.nextInt();

				basic_calculator(n, c, a);
			}
		} while (b != 2);

		sc.close();
	}

}
