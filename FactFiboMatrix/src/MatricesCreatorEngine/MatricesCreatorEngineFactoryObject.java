package MatricesCreatorEngine;

public class MatricesCreatorEngineFactoryObject {

    public static IMatricesCreatorEngine GetCreateMatricesObject() {

        return new MatricesCreatorEngineCreatorEngine();
    }
}
