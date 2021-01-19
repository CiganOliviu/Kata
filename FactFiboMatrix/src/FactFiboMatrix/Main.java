package FactFiboMatrix;

import Tests.FactorialEngineUnitTest;
import Tests.FibonacciEngineUnitTest;
import Tests.MatricesCreatorEngineUnitTest;

public class Main {

    public static void main(String[] args) {

        FibonacciEngineUnitTest fibonacciEngineUnitTest = new FibonacciEngineUnitTest();
        fibonacciEngineUnitTest.test_GetFibonacciNumber_();

        FactorialEngineUnitTest factorialEngineUnitTest = new FactorialEngineUnitTest();
        factorialEngineUnitTest.test_GetFactorialNumber_();

        MatricesCreatorEngineUnitTest matricesCreatorEngineUnitTest = new MatricesCreatorEngineUnitTest();
        matricesCreatorEngineUnitTest.test_CreateFibonacciMatrix_();
        matricesCreatorEngineUnitTest.test_CreateFactorialMatrix_();
        matricesCreatorEngineUnitTest.test_CreateCommonFibonacciAndFactorialMatrix_();
    }
}
