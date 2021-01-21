package FibonacciSetup;

public class FibonacciSetup implements IFibonacciSetup {

    @Override
    public int GetFibonacciNumber(int number) {

        if (number == 1 || number == 2)
            return 1;

        return GetFibonacciNumber(number - 1) + GetFibonacciNumber(number - 2);
    }

    @Override
    public int[] GetFibonacciArray(int sizeOfArray) {

        int[] result = new int[sizeOfArray];

        for (int it = 0; it < sizeOfArray; it++)
            result[it] = GetFibonacciNumber(it + 1);

        return result;
    }
}
