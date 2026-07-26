package Qa;

import java.util.Scanner;

// Class for checking whether a number is prime
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        int numberForChecking = scanner.nextInt();
        System.out.println("Checking number...");


        if (isPrime(numberForChecking)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }

    // Method returns true if number is prime
    public static boolean isPrime(int numberForChecking) {
        // Check special case for number 2
        if (numberForChecking == 2) {
            return true;
        }

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