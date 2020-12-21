package SearchEngine;

public class SearchEngine implements ISearchEngine {

    private boolean IsValueFound(int[] OneDimensionalArray, int index, int valueToSearch) {

        return OneDimensionalArray[index] == valueToSearch;
    }

    private boolean IsValueBigger(int[] OneDimensionalArray, int index, int valueToSearch) {

        return OneDimensionalArray[index] < valueToSearch;
    }

    private boolean IsValueSmaller(int[] OneDimensionalArray, int index, int valueToSearch) {

        return OneDimensionalArray[index] > valueToSearch;
    }

    private int GetSpecificLimit(int left, int middle, boolean condition) {

        if (condition)
            left = middle - 1;

        return left;
    }

    private int getMiddleValue(int left, int right) {

        return left + (right - left) / 2;
    }

    @Override
    public int SearchByBinarySearch(int[] OneDimensionalArray, int valueToSearch) {

        int left = 0;
        int right = OneDimensionalArray.length - 1;

        while (left <= right) {

            int middle = getMiddleValue(left, right);

            if (IsValueFound(OneDimensionalArray, middle, valueToSearch))
                return middle;

            left = GetSpecificLimit(left, middle, IsValueBigger(OneDimensionalArray, middle, valueToSearch));

            right = GetSpecificLimit(right, middle, IsValueSmaller(OneDimensionalArray, middle, valueToSearch));
        }

        return -1;
    }
}
