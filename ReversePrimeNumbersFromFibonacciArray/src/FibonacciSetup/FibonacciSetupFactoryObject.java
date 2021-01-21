package FibonacciSetup;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class FibonacciSetupFactoryObject {

    @Contract(value = " -> new", pure = true)
    public static @NotNull
    IFibonacciSetup GetFibonacciSetupObject() {

        return new FibonacciSetup();
    }
}
