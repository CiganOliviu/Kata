package SumAndProductBetweenDiagonalsMatrix;

import Tests.ITests;
import Tests.TestsFactoryObject;

public class Main {

    public static void main(String[] args) {

        ITests tests = TestsFactoryObject.GetTestsObject();

        tests.TestGetSumOfDiagonals();
        tests.TestGetProductOfDiagonals();
    }
}
