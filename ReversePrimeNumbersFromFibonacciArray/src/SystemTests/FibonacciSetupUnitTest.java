package SystemTests;

import FibonacciSetup.FibonacciSetupFactoryObject;
import FibonacciSetup.IFibonacciSetup;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciSetupUnitTest {

    IFibonacciSetup fibonacciSetup = FibonacciSetupFactoryObject.GetFibonacciSetupObject();

    @Test
    public void Test_GetFibonacciNumber_() {

        Assert.assertEquals(fibonacciSetup.GetFibonacciNumber(8),21);
        Assert.assertEquals(fibonacciSetup.GetFibonacciNumber(12),144);
        Assert.assertEquals(fibonacciSetup.GetFibonacciNumber(2),1);
        Assert.assertEquals(fibonacciSetup.GetFibonacciNumber(5),5);
    }

    @Test
    public void Test_GetFibonacciArray_() {

        Assert.assertArrayEquals(fibonacciSetup.GetFibonacciArray(5), new int[] {1, 1, 2, 3, 5} );
        Assert.assertArrayEquals(fibonacciSetup.GetFibonacciArray(8), new int[] {1, 1, 2, 3, 5, 8, 13, 21} );
        Assert.assertArrayEquals(fibonacciSetup.GetFibonacciArray(10), new int[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55} );
    }
}
