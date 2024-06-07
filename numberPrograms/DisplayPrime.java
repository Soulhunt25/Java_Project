package numberPrograms;

import java.util.Scanner;

public class DisplayPrime {
    
    static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime: ");
        int n = sc.nextInt();

        boolean result = checkPrime(n);
        System.out.println(result);

        sc.close();
    }
}
