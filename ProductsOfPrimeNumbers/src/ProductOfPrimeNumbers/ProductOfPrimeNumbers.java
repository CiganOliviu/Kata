package ProductOfPrimeNumbers;

public class ProductOfPrimeNumbers implements IProductOfPrimeNumbers {

    @Override
    public boolean IsPrime(int number) {

        if (number == 2) return true;

        for (int divisor = 2; divisor <= number / 2; divisor++)
            if (number % divisor == 0)
                return false;

        return false;
    }

    @Override
    public int GetSumOfPrimeNumbers(int factor) {

        int result = 0;

        for (int iterator = 2; iterator <= factor; iterator++)
            if (this.IsPrime(iterator))
                result += iterator;

        return result;
    }
}
