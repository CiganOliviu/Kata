package FibonacciElementsProcessor;

public class FibonacciElementsProcessorFactoryObject {

    public static IFibonacciElementsProcessor GetFibonacciElementsProcessor() {

        return new FibonacciElementsProcessor();
    }
}
