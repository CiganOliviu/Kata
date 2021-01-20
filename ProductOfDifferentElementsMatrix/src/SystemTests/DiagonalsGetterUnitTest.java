package SystemTests;

import DiagonalsGetter.DiagonalsGetterFactoryObject;
import DiagonalsGetter.IDiagonalsGetter;
import org.junit.Test;

import java.util.Arrays;

public class DiagonalsGetterUnitTest {

    private final IDiagonalsGetter diagonalsGetter = DiagonalsGetterFactoryObject.GetDiagonalsGetterObject();

    @Test
    public void Test_GetMainDiagonalFromMatrix_() {

        assert Arrays.equals(diagonalsGetter.GetMainDiagonalFromMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
               new int[] { 1, 5, 9 });
    }

    @Test
    public void Test_GetSecondDiagonalFromMatrix_() {

        assert Arrays.equals(diagonalsGetter.GetSecondDiagonalFromMatrix(new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} } ),
                new int[] { 3, 5, 7 } );
    }

}
