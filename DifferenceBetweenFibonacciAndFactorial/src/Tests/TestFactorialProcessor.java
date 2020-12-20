package Tests;

import FactorialProcessor.FactorialProcessorFactoryObject;
import FactorialProcessor.IFactorialProcessor;

public class TestFactorialProcessor {

    private final IFactorialProcessor Processor;

    public TestFactorialProcessor() {

        Processor = FactorialProcessorFactoryObject.GetFactorialProcessor();
    }

    public void ImplementFactorialTests() {

        assert Processor.GetFactorialNumber(3) == 6;
        assert Processor.GetFactorialNumber(7) == 5040;
        assert Processor.GetFactorialNumber(5) == 120;
        assert Processor.GetFactorialNumber(0) == 1;
    }
}
