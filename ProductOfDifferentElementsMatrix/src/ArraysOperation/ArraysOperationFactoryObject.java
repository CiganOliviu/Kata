package ArraysOperation;

public class ArraysOperationFactoryObject {

    public static IArraysOperation GetArraysOperation() {

        return new ArraysOperation();
    }
}
