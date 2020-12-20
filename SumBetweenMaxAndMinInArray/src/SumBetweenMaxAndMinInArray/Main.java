package SumBetweenMaxAndMinInArray;

import Tests.TestsLimitsOfArray;

public class Main {

    public static void main(String[] args) {

        TestsLimitsOfArray tests = new TestsLimitsOfArray();

        tests.TestGetMaxFromOneDimensionalArray();
        tests.TestGetMinFromOneDimensionalArray();

        SumBetweenMaxAndMinInArray SumProcessor = new SumBetweenMaxAndMinInArray();

        System.out.println(SumProcessor.GetSumBetweenMaxAndMin(5, new int[] {1, 2, 3, 4, 5}));
    }
}
