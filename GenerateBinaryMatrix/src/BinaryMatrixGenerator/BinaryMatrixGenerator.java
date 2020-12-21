package BinaryMatrixGenerator;

public class BinaryMatrixGenerator implements IBinaryMatrixGenerator {

    private boolean IsEven(int number) {

        return number % 2 == 0;
    }

    @Override
    public int[][] GenerateMatrix(int length) {

        int[][] Result = new int[length][length];

        for (int it = 0; it < length; it++)
            for (int jit = 0; jit < length; jit++)
                Result[it][jit] = IsEven(it + jit) ? 1 : 0;

        return Result;
    }
}
