package DiagonalsGetter;

public class DiagonalsGetterFactoryObject {

    public static IDiagonalsGetter GetDiagonalsGetterObject() {

        return new DiagonalsGetter();
    }
}
