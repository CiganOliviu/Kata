package FactorialProcessor;

public class FactorialProcessorFactoryObject {

    public static IFactorialProcessor GetFactorialProcessor() {

        return new FactorialProcessor();
    }
}
