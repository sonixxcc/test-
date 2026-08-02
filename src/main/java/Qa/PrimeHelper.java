package qa;

import java.util.ArrayList;
import java.util.List;

public class PrimeHelper {

    public static List<Integer> getPrimeNumbersUpTo(int limit) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (PrimeChecker.isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
}
