package Qa;

import java.util.Scanner;

// Class for checking whether a number is prime
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        int numberForChecking = scanner.nextInt();

        if (isPrime(numberForChecking)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }

    public static boolean isPrime(int numberForChecking) {
        if (numberForChecking <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numberForChecking); i++) {
            if (numberForChecking % i == 0) {
                return false;
            }
        }

        return true;
    }
}