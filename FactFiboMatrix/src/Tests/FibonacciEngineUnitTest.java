package Tests;

import FibonacciEngine.FibonacciEngineFactoryObject;
import FibonacciEngine.IFibonacciEngine;

public class FibonacciEngineUnitTest {

    private final IFibonacciEngine _fibonacciEngine = FibonacciEngineFactoryObject.getFibonacciEngine();

    public void test_GetFibonacciNumber_() {

        assert _fibonacciEngine.getFibonacciNumber(8) == 21;
        assert _fibonacciEngine.getFibonacciNumber(12) == 144;
        assert _fibonacciEngine.getFibonacciNumber(2) == 1;
        assert _fibonacciEngine.getFibonacciNumber(5) == 5;
    }
}
