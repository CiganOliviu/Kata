package SystemTests;

import ArraysOperation.ArraysOperationFactoryObject;
import ArraysOperation.IArraysOperation;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArraysOperationUnitTest {

    private final IArraysOperation arraysOperation = ArraysOperationFactoryObject.GetArraysOperation();

    @Test
    public void Test_EraseCommonElementsInArray_() {

        List<Integer> result = Arrays.asList(6, 2);

        Assert.assertEquals(arraysOperation.EraseCommonElementsInArray(new int[] {1, 6, 2, 7},
                new int[] {4, 1, 7, 4}), result);
    }

    @Test
    public void Test_GetProductOfElementsInList_() {

        List<Integer> testingList = Arrays.asList(1, 2, 3, 4, 5);

        Assert.assertEquals(arraysOperation.GetProductOfElementsInList(testingList), 120);
    }
}
