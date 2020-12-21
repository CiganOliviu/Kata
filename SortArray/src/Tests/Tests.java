package Tests;

import SortEngine.ISortEngine;
import SortEngine.SortEngineFactoryObject;

import java.util.Arrays;

public class Tests {

    final private ISortEngine sortEngine;

    public Tests() {

        sortEngine = SortEngineFactoryObject.GetSortEngineObject();
    }

    public void TestSortOneDimensionalArray() {

        assert Arrays.equals(sortEngine.SortOneDimensionalArray(5, new int[]{ 5, 4, 3, 2, 1 }), new int[]{ 1, 2, 3, 4, 5 });
        assert Arrays.equals(sortEngine.SortOneDimensionalArray(4, new int[]{ -11, -12, -13, -14 }), new int[]{ -14, -13, -12, -11 });
        assert Arrays.equals(sortEngine.SortOneDimensionalArray(7, new int[]{ 12, -12, 154, 55, -543, -42, 5 }), new int[]{ -543, -42, -12, 5, 12, 55, 154 });
    }
}
