package SystemTests;

import FibonacciOperations.FibonacciOperationsFactoryObject;
import FibonacciOperations.IFibonacciOperations;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.Is.is;

public class FibonacciOperationsUnitTest {

    IFibonacciOperations fibonacciOperations = FibonacciOperationsFactoryObject.GetFibonacciOperationsObject();

    @Test
    public void Test_IsNumberFibonacci_() {

        assertEquals(fibonacciOperations.GetFibonacciNumber(7), 13);
        assertEquals(fibonacciOperations.GetFibonacciNumber(14), 377);
        assertEquals(fibonacciOperations.GetFibonacciNumber(1), 1);
        assertEquals(fibonacciOperations.GetFibonacciNumber(3), 2);
    }

    @Test
    public void Test_GenerateFibonacciList_() {

        List<Integer> actual = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584);

        Assert.assertThat(fibonacciOperations.GenerateFibonacciList(18), is(actual));
    }
}
