package Tests;

import ProductOfPrimeNumbers.IProductOfPrimeNumbers;
import ProductOfPrimeNumbers.ProductsOfPrimeNumbersFactoryObject;

public class TestIsPrime {

    private IProductOfPrimeNumbers ProductProcessor;

    public TestIsPrime() {

        ProductProcessor = ProductsOfPrimeNumbersFactoryObject.GetProductOfPrimeNumbersObject();
    }

    public void RunTest() {

        assert ProductProcessor.IsPrime(3);
        assert ProductProcessor.IsPrime(11);
        assert !ProductProcessor.IsPrime(6);
    }
}
