package numberPrograms;

import java.util.Scanner;

public class Alternate_primeNum {
	static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		sc.close();
	}
}
