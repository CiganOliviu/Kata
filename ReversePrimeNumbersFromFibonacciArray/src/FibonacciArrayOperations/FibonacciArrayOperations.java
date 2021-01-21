package FibonacciArrayOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibonacciArrayOperations implements IFibonacciArrayOperations {

    private boolean IsNumberPrime(int number) {

        if (NumbersAreEqual(number, 1))
            return false;

        if (NumbersAreEqual(number, 2))
            return true;

        for (int it = 2; it <= number / 2; it++)
            if (NumbersAreEqual(number % it, 0))
                return false;

        return true;
    }

    private boolean NumbersAreEqual(int numberOne, int numberTwo) {

        return numberOne == numberTwo;
    }

    @Override
    public List<Integer> GetPrimeValuesFromArray(int[] array) {

        List<Integer> result = new ArrayList<>();

        for (int item : array)
            if (IsNumberPrime(item))
                result.add(item);

        return result;
    }

    @Override
    public List<Integer> ReverseList(List<Integer> list) {

        Collections.reverse(list);

        return list;
    }
}
