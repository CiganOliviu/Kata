package Tests;

import SearchEngine.ISearchEngine;
import SearchEngine.SearchEngineFactoryObject;

public class Tests {

    final private ISearchEngine searchEngine;

    public Tests() {

        searchEngine = SearchEngineFactoryObject.GetSearchEngineObject();
    }

    public void TestSearchByBinarySearch() {

        assert searchEngine.SearchByBinarySearch(new int[] { 1, 2, 3, 4, 5 }, 5) == 4;
        assert searchEngine.SearchByBinarySearch(new int[] { 12, -12, 3, 0, 54, 65 }, 0) == 3;
        assert searchEngine.SearchByBinarySearch(new int[] { 1, 2, 3, 4, 5 }, 123) == -1;
    }
}
