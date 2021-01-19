package FibonacciEngine;

public class FibonacciEngine implements IFibonacciEngine {

    @Override
    public int getFibonacciNumber(int index) {

        if (isIndexZeroOrOne(index))
            return 1;

        return getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
    }

    private boolean isIndexZeroOrOne(int index) {

        return index == 1 || index == 2;
    }
}
