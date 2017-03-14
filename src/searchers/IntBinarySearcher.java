package searchers;

import tools.ArrayUtils;

import java.util.Arrays;

/**
 * This class has methods for searching an array of integers for a particular value. It uses the binary search
 * algorithm to find the position of the element if it exists.
 *
 * TODO Implement contains and indexOf methods
 */
public class IntBinarySearcher implements Searcher {
    private int[] arr;

    /**
     * Constructor for binary searcher.
     *
     * PRECONDITION: arr is sorted.
     * @param arr the array
     */
    public IntBinarySearcher(int[] arr) {
        if (!ArrayUtils.isSorted(arr)) {
            throw new IllegalArgumentException("arr is not sorted, " + Arrays.toString(arr));
        }
        this.arr = arr;
    }

    /**
     * Determines if the target value is in the array.
     * @param target value to search for
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
     * @param target value to search for
     * @return an index if the target is in the array
     *         -1 otherwise.
     */
    @Override
    public int indexOf(Object target) {
        if (!(target instanceof Integer)) {
            throw new IllegalArgumentException("target is wrong class: " + target.getClass());
        }
        int t = (Integer)target;

        /* your code here */
        return 0;
    }
}
