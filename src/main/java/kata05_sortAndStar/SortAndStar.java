package kata05_sortAndStar;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s); // Ordena alfabéticamente (ASCII)
        String first = s[0];
        String result = String.join("***", first.split(""));
        return result;
    }
}
