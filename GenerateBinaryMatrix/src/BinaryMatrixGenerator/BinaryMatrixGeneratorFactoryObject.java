package BinaryMatrixGenerator;

public class BinaryMatrixGeneratorFactoryObject {

    public static IBinaryMatrixGenerator GetBinaryMatrixGeneratorObject() {

        return new BinaryMatrixGenerator();
    }
}
