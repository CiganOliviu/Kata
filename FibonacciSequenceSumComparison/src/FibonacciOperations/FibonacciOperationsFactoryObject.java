package FibonacciOperations;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class FibonacciOperationsFactoryObject {

    @Contract(value = " -> new", pure = true)
    public static @NotNull
    IFibonacciOperations GetFibonacciOperationsObject() {

        return new FibonacciOperations();
    }
}
