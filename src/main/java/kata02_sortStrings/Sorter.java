package kata02_sortStrings;

import java.util.Arrays;
import java.util.Comparator;

public class Sorter {
    public static String[] sortByLength(String[] array) {
        Arrays.sort(array, Comparator.comparingInt(String::length));
        return array;
    }
}
