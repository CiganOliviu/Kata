package Tests;

import MatrixProcessor.IMatrixProcessor;
import MatrixProcessor.MatrixProcessorFactoryObject;

public class Tests implements ITests {

    private final IMatrixProcessor matrixProcessor;

    public Tests() {

        matrixProcessor = MatrixProcessorFactoryObject.GetMatrixProcessorObject();
    }

    public void TestGetSumOfDiagonals() {

        assert matrixProcessor.GetSumOfDiagonals(3, new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }) == 30;
        assert matrixProcessor.GetSumOfDiagonals(4, new int[][] { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 1, 2, 3}, {4, 5, 6, 7} }) == 32;
    }

    public void TestGetProductOfDiagonals() {

        assert matrixProcessor.GetProductOfDiagonals(3, new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }) == 4725;
        assert matrixProcessor.GetProductOfDiagonals(4, new int[][] { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 1, 2, 3}, {4, 5, 6, 7} }) == 9408;
    }
}
