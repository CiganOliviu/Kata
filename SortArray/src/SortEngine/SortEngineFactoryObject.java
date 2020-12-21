package SortEngine;

public class SortEngineFactoryObject {

    public static ISortEngine GetSortEngineObject() {

        return new SortEngine();
    }
}
