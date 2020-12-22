package MatrixProcessor;

public class MatrixProcessor implements IMatrixProcessor {

    private int GetSumOfMainDiagonalElements(int length, int[][] Matrix) {

        assert length > 0;

        int result = 0;

        for (int it = 0; it < length; it++)
            result += Matrix[it][it];

        return result;
    }

    private int GetSumOfSecondDiagonalElements(int length, int[][] Matrix) {

        assert length > 0;

        int result = 0;

        for (int it = 0; it < length; it++)
            for (int jit = 0; jit < length; jit++)
                result = it + jit == length - 1 ? result + Matrix[it][jit] : result;

        return result;
    }

    private int GetProductOfMainDiagonalElements(int length, int[][] Matrix) {

        assert length > 0;

        int result = 1;

        for (int it = 0; it < length; it++)
                result *= Matrix[it][it];

        return result;
    }

    private int GetProductOfSecondDiagonalElements(int length, int[][] Matrix) {

        assert length > 0;

        int result = 1;

        for (int it = 0; it < length; it++)
            for (int jit = 0; jit < length; jit++)
                result = it + jit == length - 1 ? result * Matrix[it][jit] : result;

        return result;
    }

    @Override
    public int GetSumOfDiagonals(int length, int[][] Matrix) {

        int SumOfMainDiagonalElements = this.GetSumOfMainDiagonalElements(length, Matrix);
        int SumOfSecondDiagonalElements = this.GetSumOfSecondDiagonalElements(length, Matrix);

        return SumOfMainDiagonalElements + SumOfSecondDiagonalElements;
    }

    @Override
    public int GetProductOfDiagonals(int length, int[][] Matrix) {

        int ProductOfMainDiagonalElements = this.GetProductOfMainDiagonalElements(length, Matrix);
        int ProductOfSecondDiagonalElements = this.GetProductOfSecondDiagonalElements(length, Matrix);

        return ProductOfMainDiagonalElements * ProductOfSecondDiagonalElements;
    }
}
