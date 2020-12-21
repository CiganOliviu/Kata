package CountDivisorsOfTheSameParity;

import DivisorsProcessor.DivisorsProcessorFactoryObject;
import DivisorsProcessor.IDivisorsProcessor;

public class Tests {

    final private IDivisorsProcessor Processor;

    public Tests() {

        Processor = DivisorsProcessorFactoryObject.GetDivisorsProcessorObject();
    }

    public void TestCountOddDivisors() {

        assert Processor.CountOddDivisors(8) == 4;
        assert Processor.CountOddDivisors(9) == 5;
        assert Processor.CountOddDivisors(1) == 1;
    }

    public void TestCountEvenDivisors() {

        assert Processor.CountEvenDivisors(8) == 4;
        assert Processor.CountEvenDivisors(9) == 4;
        assert Processor.CountEvenDivisors(1) == 0;
    }
}
