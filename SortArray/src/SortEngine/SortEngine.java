package SortEngine;

public class SortEngine implements ISortEngine {

    private void SwapElementsInOneDimensionalArray(int it, int jit, int[] OneDimensionalArray) {

        OneDimensionalArray[it] = OneDimensionalArray[it] + OneDimensionalArray[jit];
        OneDimensionalArray[jit] = OneDimensionalArray[it] - OneDimensionalArray[jit];
        OneDimensionalArray[it] = OneDimensionalArray[it] - OneDimensionalArray[jit];
    }

    @Override
    public int[] SortOneDimensionalArray(int length, int[] OneDimensionalArray) {

        assert length > 0;

        int[] Result;
        Result = OneDimensionalArray;

        for (int iterator = 0; iterator < length; iterator++)
            for (int jiterator = iterator + 1; jiterator < length; jiterator++)
                if (Result[iterator] > Result[jiterator])
                    SwapElementsInOneDimensionalArray(iterator, jiterator, Result);

        return Result;
    }
}
