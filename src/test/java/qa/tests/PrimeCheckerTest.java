package qa.tests;

import qa.PrimeChecker;
import qa.PrimeHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

    @Test(dataProvider = "primeNumbers", groups = "positive")
    public void testPrimeNumbers(int number) {
        Assert.assertTrue(PrimeChecker.isPrime(number));
    }

    @Test(dataProvider = "nonPrimeNumbers", groups = "negative")
    public void testNonPrimeNumbers(int number) {
        Assert.assertFalse(PrimeChecker.isPrime(number));
    }

    @Test(groups = "edge")
    public void testNumberTwo() {
        Assert.assertTrue(PrimeChecker.isPrime(2));
    }

    @Test(groups = "edge")
    public void testNegativeNumber() {
        Assert.assertFalse(PrimeChecker.isPrime(-10));
    }

    @Test(groups = "edge")
    public void testZero() {
        Assert.assertFalse(PrimeChecker.isPrime(0));
    }

    @Test(groups = "edge")
    public void testOne() {
        Assert.assertFalse(PrimeChecker.isPrime(1));
    }

    @Test(groups = "collection")
    public void testPrimeListContainsValues() {
        List<Integer> primes = PrimeHelper.getPrimeNumbersUpTo(10);
        Assert.assertTrue(primes.contains(7));
    }

    @Test(groups = "collection")
    public void testPrimeListSize() {
        List<Integer> primes = PrimeHelper.getPrimeNumbersUpTo(10);
        Assert.assertEquals(primes.size(), 4); // 2,3,5,7
    }

    @Test(groups = "collection")
    public void testPrimeListNotEmpty() {
        List<Integer> primes = PrimeHelper.getPrimeNumbersUpTo(5);
        Assert.assertFalse(primes.isEmpty());
    }

    @Test(groups = "collection")
    public void testPrimeListDoesNotContainNonPrime() {
        List<Integer> primes = PrimeHelper.getPrimeNumbersUpTo(10);
        Assert.assertFalse(primes.contains(4));
    }
}
