package GetProductOfPrimeNumbers;

import Tests.TestGetProductOfPrimeNumbers;
import Tests.TestIsPrime;

public class Main {

    public static void main(String[] args) {

        RunIsPrimeTest();

        RunGetProductOfPrimeNumbersTest();
    }

    private static void RunGetProductOfPrimeNumbersTest() {
        TestGetProductOfPrimeNumbers testGetProductOfPrimeNumbers = new TestGetProductOfPrimeNumbers();

        testGetProductOfPrimeNumbers.RunTest();
    }

    private static void RunIsPrimeTest() {
        TestIsPrime testIsPrime = new TestIsPrime();

        testIsPrime.RunTest();
    }
}
