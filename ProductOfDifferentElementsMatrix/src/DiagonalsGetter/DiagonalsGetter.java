package DiagonalsGetter;

import org.jetbrains.annotations.NotNull;

public class DiagonalsGetter implements IDiagonalsGetter {

    @Override
    public int[] GetMainDiagonalFromMatrix(int[] @NotNull [] matrix) {

        int length = matrix.length;

        int[] result = new int[length];
        int index = 0;

        for (int it = 0; it < length; it++) {
            result[index] = matrix[it][it];
            index += 1;
        }

        return result;
    }

    @Override
    public int[] GetSecondDiagonalFromMatrix(int[] @NotNull [] matrix) {

        int length = matrix.length;
        int[] result = new int[length];
        int index = 0;

        for (int it = 0; it < length; it++) {
            for (int jit = 0; jit < length; jit++)
                if (it + jit == length - 1) {
                    result[index] = matrix[it][jit];
                    index += 1;
                }
        }

        return result;
    }
}
