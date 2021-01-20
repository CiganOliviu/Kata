package ArraysOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArraysOperation implements IArraysOperation {

    private boolean CheckIfValueDoesNotExistsInArray(int[] array, int value) {

        return IntStream.range(0, array.length).noneMatch(it -> value == array[it]);
    }

    @Override
    public List<Integer> EraseCommonElementsInArray(int[] baseArray, int[] auxArray) {

        List<Integer> Result = new ArrayList<Integer>();

        for (int itemBaseArray : baseArray) {
            if (CheckIfValueDoesNotExistsInArray(auxArray, itemBaseArray))
                Result.add(itemBaseArray);
        }

        return Result;
    }

    @Override
    public int GetProductOfElementsInList(List<Integer> list) {

        int result = 1;

        for (int item : list)
            result *= item;

        return result;
    }
}
