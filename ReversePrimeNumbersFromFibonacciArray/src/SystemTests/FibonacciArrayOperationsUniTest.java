package SystemTests;

import FibonacciArrayOperations.FibonacciArrayOperationsFactoryObject;
import FibonacciArrayOperations.IFibonacciArrayOperations;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class FibonacciArrayOperationsUniTest {

    IFibonacciArrayOperations fibonacciArrayOperations = FibonacciArrayOperationsFactoryObject.GetFibonacciArrayOperations();

    @Test
    public void Test_GetPrimeValuesFromArray_() {

        List<Integer> expected = Arrays.asList(2, 3, 5, 13);

        Assert.assertThat(fibonacciArrayOperations.GetPrimeValuesFromArray(new int[] {1, 1, 2, 3, 5, 8, 13, 21, 34}),
                is(expected));
    }

    @Test
    public void Test_ReverseList_() {

        List<Integer> actual = Arrays.asList(2, 3, 5, 13);
        List<Integer> expected = Arrays.asList(13, 5, 3, 2);

        Assert.assertThat(fibonacciArrayOperations.ReverseList(actual),
                is(expected));
    }
}
