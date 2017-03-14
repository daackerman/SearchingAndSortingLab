package sorters;

import java.util.List;

/**
 * This class has methods to sort a List of Strings. It uses the insertion sort algorithm and String's compareTo
 * method to sort the Strings in lexicographical order.
 *
 * TODO implement sort method
 */
public class StringInsertionSorter implements Sorter {
    private List<String> list;

    /**
     * Constructor for StringInsertionSorter
     * @param l the list to sort
     */
    public StringInsertionSorter(List<String> l) {
        list = l;
    }

    /**
     * Implements the insertion sort algorithm on this list of Strings.
     */
    @Override
    public void sort() {
        /* your code here */
    }
}
