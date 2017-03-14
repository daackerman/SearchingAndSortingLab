package sorters;

import java.util.List;
import tools.ArrayUtils;

/**
 * This class has methods to sort a List of Strings. It uses the selection sort algorithm and String's compareTo
 * method to sort the Strings in lexicographical order.
 *
 * TODO implement sort method
 */
public class StringSelectionSorter implements Sorter {
    private List<String> list;

    /**
     * Constructor for the StringSelectionSorter.
     * @param l the list to sort.
     */
    public StringSelectionSorter(List<String> l) {
        list = l;
    }

    /**
     * Implements the selection sort algorithm on this list of Strings.
     */
    @Override
    public void sort() {
        /* your code here */
    }

    /**
     * Determines the index of the first String using lexicographical ordering in list between i and j - 1.
     * @param i smallest possible index
     * @param j 1 more than largest possible index
     * @return the position of the first String
     */
    private int minPosition(int i, int j) {
        /* your code here */
        return 0;
    }
}
