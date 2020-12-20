package Tests;

import LimitsOfArray.ILimitsOfArray;
import LimitsOfArray.LimitsOfArrayFactoryObject;

public class TestsLimitsOfArray {

    private final ILimitsOfArray limits;

    public TestsLimitsOfArray() {

        limits = LimitsOfArrayFactoryObject.GetLimitsOfArrayObject();
    }

    public void TestGetMinFromOneDimensionalArray() {

        assert limits.GetMaxValueFromArray(5, new int[] {1, 2, 3, 4, 5}) == 5;
        assert limits.GetMaxValueFromArray(7, new int[] {12, -12, 31, 15, 16, 7, -32}) == 31;
    }

    public void TestGetMaxFromOneDimensionalArray() {

        assert limits.GetMinValueFromArray(5, new int[] {1, 2, 3, 4, 5}) == 1;
        assert limits.GetMinValueFromArray(7, new int[] {12, -12, 31, 15, 16, 7, -32}) == -32;
    }
}
