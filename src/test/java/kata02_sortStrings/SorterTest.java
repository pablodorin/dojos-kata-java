package kata02_sortStrings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SorterTest {
    @Test
    public void testSortByLength() {
        System.out.println("=====KATA02_SorterTest executing=====");
        String[] input = { "Telescopes", "Glasses", "Eyes", "Monocles" };
        String[] expected = { "Eyes", "Glasses", "Monocles", "Telescopes" };
        String[] result = Sorter.sortByLength(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testShortArray() {
        String[] input = { "ab", "a", "abc" };
        String[] expected = { "a", "ab", "abc" };
        String[] result = Sorter.sortByLength(input);
        assertArrayEquals(expected, result);
    }
}
