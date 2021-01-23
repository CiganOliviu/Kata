package SystemTests;

import FibonacciElementsProcessor.FibonacciElementsProcessorFactoryObject;
import FibonacciElementsProcessor.IFibonacciElementsProcessor;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class FibonacciElementsProcessorUnitTest {

    IFibonacciElementsProcessor fibonacciElementsProcessor = FibonacciElementsProcessorFactoryObject.GetFibonacciElementsProcessor();

    @Test
    public void Test_GetSumOfEvenDigits_() {

        List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584);
        assertEquals(fibonacciElementsProcessor.GetSumOfEvenDigits(list), 30);
    }

    @Test
    public void Test_GetSumOfOddDigits_() {

        List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584);
        assertEquals(fibonacciElementsProcessor.GetSumOfOddDigits(list), 33);
    }
}
