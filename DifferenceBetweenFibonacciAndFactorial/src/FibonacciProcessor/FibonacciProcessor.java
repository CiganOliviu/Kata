package FibonacciProcessor;

public class FibonacciProcessor implements IFibonacciProcessor {

    @Override
    public int GetFibonacciNumber(int Factor) {

        if (Factor == 1 || Factor == 2) return 1;

        return GetFibonacciNumber(Factor - 1) + GetFibonacciNumber(Factor - 2);
    }
}
