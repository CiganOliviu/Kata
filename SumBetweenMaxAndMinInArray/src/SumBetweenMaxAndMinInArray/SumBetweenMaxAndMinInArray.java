package SumBetweenMaxAndMinInArray;

import LimitsOfArray.ILimitsOfArray;
import LimitsOfArray.LimitsOfArrayFactoryObject;

public class SumBetweenMaxAndMinInArray {

    private final ILimitsOfArray limits;

    public SumBetweenMaxAndMinInArray() {

        limits = LimitsOfArrayFactoryObject.GetLimitsOfArrayObject();
    }

    int GetSumBetweenMaxAndMin(int length, int[] OneDimensionalArray) {

        return limits.GetMaxValueFromArray(length, OneDimensionalArray) + limits.GetMinValueFromArray(length, OneDimensionalArray);
    }
}
