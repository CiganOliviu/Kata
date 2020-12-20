package DifferenceBetweenFibonacciAndFactorial;

import FactorialProcessor.IFactorialProcessor;
import FactorialProcessor.FactorialProcessorFactoryObject;

import FibonacciProcessor.IFibonacciProcessor;
import FibonacciProcessor.FibonacciProcessorFactoryObject;

public class DifferenceBetweenNumbers {

    private final IFibonacciProcessor Fibonacci;
    private final IFactorialProcessor Factorial;

    public DifferenceBetweenNumbers() {

        Fibonacci = FibonacciProcessorFactoryObject.GetFibonacciProcessor();
        Factorial = FactorialProcessorFactoryObject.GetFactorialProcessor();
    }

    public int RealiseSubtractionBetweenFibonacciAndFactorial(int Factor) {

        return Fibonacci.GetFibonacciNumber(Factor) - Factorial.GetFactorialNumber(Factor);
    }
}
