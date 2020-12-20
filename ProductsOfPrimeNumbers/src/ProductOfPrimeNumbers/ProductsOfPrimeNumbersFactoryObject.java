package ProductOfPrimeNumbers;

public class ProductsOfPrimeNumbersFactoryObject {

    public static IProductOfPrimeNumbers GetProductOfPrimeNumbersObject() {

        return new ProductOfPrimeNumbers();
    }
}
