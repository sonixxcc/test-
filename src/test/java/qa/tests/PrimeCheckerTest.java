package qa.tests;

import qa.PrimeChecker;
import qa.PrimeHelper;

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class PrimeCheckerTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Starting test...");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Test finished.");
    }

    @DataProvider(name = "primeNumbers")
    public Object[][] primeNumbers() {
        return new Object[][]{
                {2}, {3}, {5}, {7}, {11}
        };
    }

    @DataProvider(name = "nonPrimeNumbers")
    public Object[][] nonPrimeNumbers() {
        return new Object[][]{
                {0}, {1}, {-5}, {4}, {9}
        };
    }

    // ---------- TESTS ----------

    @Test(
            dataProvider = "primeNumbers",
            groups = "positive",
            description = "Verify that known prime numbers return true"
    )
    public void testPrimeNumbers(int number) {
        Assert.assertTrue(
                PrimeChecker.isPrime(number),
                "Expected number " + number + " to be PRIME, but it was NOT"
        );
    }

    @Test(
            dataProvider = "nonPrimeNumbers",
            groups = "negative",
            description = "Verify that non-prime numbers return false"
    )
    public void testNonPrimeNumbers(int number) {
        Assert.assertFalse(
                PrimeChecker.isPrime(number),
                "Expected number " + number + " to be NOT prime, but it WAS"
        );
    }

    @Test(
            groups = "edge",
            description = "Check that number 2 is prime (smallest prime)"
    )
    public void testNumberTwo() {
        Assert.assertTrue(
                PrimeChecker.isPrime(2),
                "2 should be prime, but method returned false"
        );
    }

    @Test(
            groups = "edge",
            description = "Check that negative numbers are not prime"
    )
    public void testNegativeNumber() {
        Assert.assertFalse(
                PrimeChecker.isPrime(-10),
                "Negative numbers should NOT be prime"
        );
    }

    @Test(
            groups = "edge",
            description = "Check that zero is not prime"
    )
    public void testZero() {
        Assert.assertFalse(
                PrimeChecker.isPrime(0),
                "0 should NOT be prime"
        );
    }

    @Test(
            groups = "edge",
            description = "Check that 1 is not prime"
    )
    public void testOne() {
        Assert.assertFalse(
                PrimeChecker.isPrime(1),
                "1 should NOT be prime"
        );
    }

    @Test(
            groups = "collection",
            description = "Verify that prime list up to 10 contains exactly 4 numbers"
    )
    public void testPrimeListSize() {
        List<Integer> primes = PrimeHelper.getPrimeNumbersUpTo(10);

        Assert.assertEquals(
                primes.size(),
                4,
                "Expected 4 prime numbers up to 10, but got " + primes.size()
        );
    }

    @Test(
            groups = "collection",
            description = "Verify that prime list is not empty for input > 2"
    )
    public void testPrimeListNotEmpty() {
        List<Integer> primes = PrimeHelper.getPrimeNumbersUpTo(5);

        Assert.assertFalse(
                primes.isEmpty(),
                "Prime list should NOT be empty"
        );
    }

    @Test(
            groups = "collection",
            description = "Verify that prime list does not contain non-prime numbers"
    )
    public void testPrimeListDoesNotContainNonPrime() {
        List<Integer> primes = PrimeHelper.getPrimeNumbersUpTo(10);

        Assert.assertFalse(
                primes.contains(4),
                "Prime list SHOULD NOT contain non-prime number 4"
        );
    }
}