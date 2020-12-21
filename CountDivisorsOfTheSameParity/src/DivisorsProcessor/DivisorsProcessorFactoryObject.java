package DivisorsProcessor;

public class DivisorsProcessorFactoryObject {

    public static IDivisorsProcessor GetDivisorsProcessorObject() {

        return new DivisorsProcessor();
    }
}
