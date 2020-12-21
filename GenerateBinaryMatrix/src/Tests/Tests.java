package Tests;

import BinaryMatrixGenerator.BinaryMatrixGeneratorFactoryObject;
import BinaryMatrixGenerator.IBinaryMatrixGenerator;

import java.util.Arrays;

public class Tests {

    final IBinaryMatrixGenerator binaryMatrixGenerator;

    public Tests() {

        binaryMatrixGenerator = BinaryMatrixGeneratorFactoryObject.GetBinaryMatrixGeneratorObject();
    }

    public void TestGenerateBinaryMatrix() {

        assert Arrays.deepEquals(binaryMatrixGenerator.GenerateMatrix(3), new int[][]{{1, 0, 1}, {0, 1, 0}, {1, 0, 1}});
        assert Arrays.deepEquals(binaryMatrixGenerator.GenerateMatrix(4), new int[][]{{1, 0, 1, 0}, {0, 1, 0, 1}, {1, 0, 1, 0}, {0, 1, 0, 1} });
        assert Arrays.deepEquals(binaryMatrixGenerator.GenerateMatrix(2), new int[][]{{1, 0}, {0, 1} });
    }
}
