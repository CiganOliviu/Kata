package SearchEngine;

public class SearchEngineFactoryObject {

    public static ISearchEngine GetSearchEngineObject() {

        return new SearchEngine();
    }
}
