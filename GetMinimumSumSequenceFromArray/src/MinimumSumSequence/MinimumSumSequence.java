package MinimumSumSequence;

public class MinimumSumSequence implements IMinimumSumSequence{

    @Override
    public int GetMinimumSumSequence(int length, int[] OneDimensionalArray) {

        int result = 0;
        int sum = 0;

        for (int iterator = 0; iterator < length; iterator++) {

            sum += OneDimensionalArray[iterator];

            result = Math.max(result, sum);

            sum = Math.max(sum, 0);
        }

        return result;
    }
}
