package edu.isu.cs.cs3308.algorithms.impl;

import edu.isu.cs.cs3308.algorithms.ArraySearch;

public class BinarySearch  implements ArraySearch {
    /**
     * Generic array search method.
     *
     * @param <E> Type of data searched must implement Comparable interface.
     * @param array Array to be search for the provided item
     * @param item Item to be found
     * @return The index of the provided item in the array. Returns -1 if any of
     * the following conditions are met:
     * <ul>
     * <li>The provided array is null</li>
     * <li>The provided array is empty</li>
     * <li>The provided item is null</li>
     * <li>The provided array does not contain the item</li>
     * </ul>
     */
    public <E extends Comparable> int search(E[] array, E item){
        int toReturn = -1;
        if (array != null && array.length != 0 && item != null){
            int low = 0;
            int high = array.length -1;

            while (low <= high){
                int index = (low + high) / 2;
                if (item.compareTo(array[index]) == 0){
                    return index;
                }
                else if (item.compareTo(array[index]) < 0){
                    high = index - 1;
                }
                else {
                    low = index + 1;
                }
            }
        }


        return toReturn;
}
}
