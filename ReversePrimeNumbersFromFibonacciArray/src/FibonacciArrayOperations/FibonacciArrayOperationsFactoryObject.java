package FibonacciArrayOperations;

public class FibonacciArrayOperationsFactoryObject {

    public static IFibonacciArrayOperations GetFibonacciArrayOperations() {

        return new FibonacciArrayOperations();
    }
}
