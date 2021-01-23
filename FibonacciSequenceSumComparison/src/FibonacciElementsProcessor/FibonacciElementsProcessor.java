package FibonacciElementsProcessor;

import java.util.List;

public class FibonacciElementsProcessor implements IFibonacciElementsProcessor  {

    private boolean IsEvenNumber(int number) {

        return number % 2 == 0;
    }

    private boolean IsOddNumber(int number) {

        return number % 2 == 1;
    }

    private int GetFirstDigitOfNumber(int number) {

        int digit = 0;

        while (number != 0) {

            digit = number % 10;
            number /= 10;
        }

        return digit;
    }

    @Override
    public int GetSumOfEvenDigits(List<Integer> fibonacciList) {

        int sum = 0;

        for (var item : fibonacciList)
            if (IsEvenNumber(GetFirstDigitOfNumber(item)))
                sum += GetFirstDigitOfNumber(item);

        return sum;
    }

    @Override
    public int GetSumOfOddDigits(List<Integer> fibonacciList) {

        int sum = 0;

        for (var item : fibonacciList)
            if (IsOddNumber(GetFirstDigitOfNumber(item)))
                sum += GetFirstDigitOfNumber(item);

        return sum;
    }
}
