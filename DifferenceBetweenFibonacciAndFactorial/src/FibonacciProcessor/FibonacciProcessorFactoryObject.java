package FibonacciProcessor;

public class FibonacciProcessorFactoryObject {

    public static IFibonacciProcessor GetFibonacciProcessor() {

        return new FibonacciProcessor();
    }
}
