package FibonacciOperations;

import java.util.ArrayList;
import java.util.List;

public class FibonacciOperations implements IFibonacciOperations {

    private boolean IsNumberZeroOrOne(int number) {
        return number == 1 || number == 2;
    }

    @Override
    public int GetFibonacciNumber(int number) {

        if (IsNumberZeroOrOne(number))
            return 1;

        return GetFibonacciNumber(number - 1) + GetFibonacciNumber(number - 2);
    }

    @Override
    public List<Integer> GenerateFibonacciList(int sizeList) {

        List<Integer> result = new ArrayList<>();

        for (int it = 0; it < sizeList; it++)
            result.add(GetFibonacciNumber(it + 1));

        return result;
    }
}
