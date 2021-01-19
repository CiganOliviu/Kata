package MatricesCreatorEngine;

public interface IMatricesCreatorEngine {

    int[][] createFibonacciMatrix(int length);
    int[][] createFactorialMatrix(int length);
    int[][] createCommonFibonacciAndFactorialMatrix(int[][] fibonacciMatrix, int[][] factorialMatrix);
}
