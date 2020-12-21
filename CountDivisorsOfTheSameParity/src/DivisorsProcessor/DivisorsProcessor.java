package DivisorsProcessor;

public class DivisorsProcessor implements IDivisorsProcessor {

    private boolean IsOdd(int number) {

        return number % 2 == 1;
    }

    private boolean IsEven(int number) {

        return number % 2 == 0;
    }

    @Override
    public int CountOddDivisors(int Limit) {

        assert Limit > 0;

        int result = 0;

        for (int divisor = 1; divisor <= Limit; divisor++)
            if (this.IsOdd(divisor))
                result += 1;

        return result;
    }

    @Override
    public int CountEvenDivisors(int Limit) {

        assert Limit > 0;

        int result = 0;

        for (int divisor = 2; divisor <= Limit; divisor++)
            if (this.IsEven(divisor))
                result += 1;

        return result;
    }
}
