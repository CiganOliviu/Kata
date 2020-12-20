package DifferenceBetweenFibonacciAndFactorial;

import Tests.TestFactorialProcessor;
import Tests.TestFibonacciProcessor;

public class Main {

    public static void main(String[] args) {

        RunTestsForFibonacci();
        RunTestsForFactorial();

        System.out.println(ProcessSubtraction());
    }

    private static int ProcessSubtraction() {

        DifferenceBetweenNumbers differenceBetweenNumbers = new DifferenceBetweenNumbers();

        return differenceBetweenNumbers.RealiseSubtractionBetweenFibonacciAndFactorial(3);
    }

    private static void RunTestsForFactorial() {
        TestFactorialProcessor FactorialTest = new TestFactorialProcessor();
        FactorialTest.ImplementFactorialTests();
    }

    private static void RunTestsForFibonacci() {
        TestFibonacciProcessor FibonacciTest = new TestFibonacciProcessor();
        FibonacciTest.ImplementFibonacciTests();
    }
}
