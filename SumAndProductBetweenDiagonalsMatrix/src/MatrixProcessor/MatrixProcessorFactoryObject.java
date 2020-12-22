package MatrixProcessor;

public class MatrixProcessorFactoryObject {

    public static IMatrixProcessor GetMatrixProcessorObject() {

        return new MatrixProcessor();
    }
}
