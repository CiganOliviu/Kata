package Tests;

import ProductOfPrimeNumbers.IProductOfPrimeNumbers;
import ProductOfPrimeNumbers.ProductsOfPrimeNumbersFactoryObject;

public class TestGetProductOfPrimeNumbers {

    IProductOfPrimeNumbers ProductProcessor;

    public TestGetProductOfPrimeNumbers() {

        ProductProcessor = ProductsOfPrimeNumbersFactoryObject.GetProductOfPrimeNumbersObject();
    }

    public void RunTest() {

        assert ProductProcessor.GetSumOfPrimeNumbers(8) == 210;
        assert ProductProcessor.GetSumOfPrimeNumbers(12) == 2310;
        assert ProductProcessor.GetSumOfPrimeNumbers(13) == 30030;
    }
}
