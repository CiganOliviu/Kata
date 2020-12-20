package LimitsOfArray;

public class LimitsOfArray implements ILimitsOfArray {

    @Override
    public int GetMaxValueFromArray(int length, int[] OneDimensionalArray) {

        int result = OneDimensionalArray[0];

        for (int iterator = 1; iterator < length; iterator++)
            result = Math.max(result, OneDimensionalArray[iterator]);

        return result;
    }

    @Override
    public int GetMinValueFromArray(int length, int[] OneDimensionalArray) {

        int result = OneDimensionalArray[0];

        for (int iterator = 1; iterator < length; iterator++)
            result = Math.min(result, OneDimensionalArray[iterator]);

        return result;
    }
}
