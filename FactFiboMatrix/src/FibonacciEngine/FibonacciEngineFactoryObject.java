package FibonacciEngine;

public class FibonacciEngineFactoryObject {

    public static IFibonacciEngine getFibonacciEngine() {

        return new FibonacciEngine();
    }
}
