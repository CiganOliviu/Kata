package FactorialEngine;

public class FactorialEngineFactoryObject {

    public static IFactorialEngine getFactorialEngine() {

        return new FactorialEngine();
    }
}
