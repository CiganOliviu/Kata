package Tests;

import FibonacciProcessor.FibonacciProcessorFactoryObject;
import FibonacciProcessor.IFibonacciProcessor;

public class TestFibonacciProcessor {

    private final IFibonacciProcessor Processor;

    public TestFibonacciProcessor() {

        Processor = FibonacciProcessorFactoryObject.GetFibonacciProcessor();
    }

    public void ImplementFibonacciTests() {

        assert Processor.GetFibonacciNumber(8) == 21;
        assert Processor.GetFibonacciNumber(12) == 144;
        assert Processor.GetFibonacciNumber(2) == 1;
        assert Processor.GetFibonacciNumber(5) == 5;
    }
}
