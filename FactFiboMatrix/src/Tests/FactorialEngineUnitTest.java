package Tests;

import FactorialEngine.FactorialEngineFactoryObject;
import FactorialEngine.IFactorialEngine;

public class FactorialEngineUnitTest {

    private final IFactorialEngine _factorialEngine = FactorialEngineFactoryObject.getFactorialEngine();

    public void test_GetFactorialNumber_() {

        assert _factorialEngine.getFactorialNumber(3) == 6;
        assert _factorialEngine.getFactorialNumber(7) == 5040;
        assert _factorialEngine.getFactorialNumber(5) == 120;
        assert _factorialEngine.getFactorialNumber(1) == 1;
    }
}
