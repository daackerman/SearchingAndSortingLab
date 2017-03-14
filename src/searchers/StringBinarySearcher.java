package searchers;

import java.util.List;

/**
 * This class has methods for searching an list of Strings for a particular String. It uses the binary search
 * algorithm to find the position of the element if it exists.
 *
 * TODO Implement contains and indexOf methods
 */
public class StringBinarySearcher implements Searcher {
    private List<String> list;

    public StringBinarySearcher(List<String> list) {
        this.list = list;
    }

    /**
     * Determines if the target value is in the array.
     * @param target String to search for
     * @return true if target is in the array
     *         false otherwise.
     */
    @Override
    public boolean contains(Object target) {
        /* your code here */
        return false;
    }

    /**
     * Determines the first index of the target value in the array.
     * @param target String to search for
     * @return an index if the target is in the array
     *         -1 otherwise.
     */
    @Override
    public int indexOf(Object target) {
        if (!(target instanceof String)) {
            throw new IllegalArgumentException("target is wrong class: " + target.getClass());
        }
        String t = (String)target;

        /* your code here */
        return 0;
    }
}
