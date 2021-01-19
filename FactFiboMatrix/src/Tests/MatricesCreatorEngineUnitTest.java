package Tests;

import MatricesCreatorEngine.IMatricesCreatorEngine;
import MatricesCreatorEngine.MatricesCreatorEngineFactoryObject;

import java.util.Arrays;

public class MatricesCreatorEngineUnitTest {

    private final IMatricesCreatorEngine matricesCreatorEngine = MatricesCreatorEngineFactoryObject.GetCreateMatricesObject();

    public void test_CreateFibonacciMatrix_() {

        assert Arrays.deepEquals(matricesCreatorEngine.createFibonacciMatrix(3),
                new int[][] { {1, 1, 2}, {3, 5, 8}, {13, 21, 34}});
    }

    public void test_CreateFactorialMatrix_() {

        assert Arrays.deepEquals(matricesCreatorEngine.createFactorialMatrix(3),
                new int[][] { {1, 2, 6}, {24, 120, 720}, {5040, 40320, 362880}});
    }

    public void test_CreateCommonFibonacciAndFactorialMatrix_() {

        int[][] factorialMatrix = matricesCreatorEngine.createFactorialMatrix(3);
        int[][] fibonacciMatrix= matricesCreatorEngine.createFibonacciMatrix(3);

        assert Arrays.deepEquals(matricesCreatorEngine.createCommonFibonacciAndFactorialMatrix(fibonacciMatrix, factorialMatrix),
                new int[][] {{1, 2, 6}, {3, 5, 8}, {5040, 40320, 34}});
    }
}
