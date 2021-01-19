package MatricesCreatorEngine;

import FactorialEngine.FactorialEngineFactoryObject;
import FactorialEngine.IFactorialEngine;
import FibonacciEngine.FibonacciEngineFactoryObject;
import FibonacciEngine.IFibonacciEngine;
import org.jetbrains.annotations.NotNull;

public class MatricesCreatorEngineCreatorEngine implements IMatricesCreatorEngine {

    private final IFibonacciEngine fibonacciEngine = FibonacciEngineFactoryObject.getFibonacciEngine();
    private final IFactorialEngine factorialEngine = FactorialEngineFactoryObject.getFactorialEngine();

    @Override
    public int[][] createFibonacciMatrix(int length) {

        int[][] resultMatrix = new int[length][length];

        int index = 1;

        for (int it = 0; it < length; it++)
            for (int jt = 0; jt < length; jt++) {
                resultMatrix[it][jt] = fibonacciEngine.getFibonacciNumber(index);
                index += 1;
            }

        return resultMatrix;
    }

    @Override
    public int[][] createFactorialMatrix(int length) {

        int[][] resultMatrix = new int[length][length];

        int index = 1;

        for (int it = 0; it < length; it++)
            for (int jt = 0; jt < length; jt++) {
                resultMatrix[it][jt] = factorialEngine.getFactorialNumber(index);
                index += 1;
            }

        return resultMatrix;
    }

    private int getFirstDigitOfNumber(int number) {

        int copyOfNumber = number;
        int digit = 0;

        while (copyOfNumber != 0) {

            digit = copyOfNumber % 10;

            copyOfNumber /= 10;
        }

        return digit;
    }

    private int getNumberWithFirstDigitBigger(int numberOne, int numberTwo) {

        return (getFirstDigitOfNumber(numberOne) >= getFirstDigitOfNumber(numberTwo)) ? numberOne : numberTwo;
    }

    @Override
    public int[][] createCommonFibonacciAndFactorialMatrix(int[] @NotNull [] fibonacciMatrix, int[][] factorialMatrix) {

        int length = fibonacciMatrix.length;
        int[][] resultMatrix = new int[length][length];

        for (int it = 0; it < length; it++)
            for (int jt = 0; jt < length; jt++)
                resultMatrix[it][jt] = getNumberWithFirstDigitBigger(fibonacciMatrix[it][jt], factorialMatrix[it][jt]);

        return resultMatrix;
    }
}
