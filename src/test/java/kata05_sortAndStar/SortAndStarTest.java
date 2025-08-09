package kata05_sortAndStar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortAndStarTest {

    @Test
    public void testTwoSort() {
        System.out.println("=====KATA05_SORT AND STAR=====");
        assertEquals(
                "b***i***t***c***o***i***n",
                SortAndStar.twoSort(new String[] {
                        "bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"
                }));

        assertEquals(
                "a***r***e",
                SortAndStar.twoSort(new String[] {
                        "turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic",
                        "ones"
                }));

        assertEquals(
                "a***a***a",
                SortAndStar.twoSort(new String[] { "abc", "aaa", "zzz" }));

        assertEquals(
                "h***e***l***l***o",
                SortAndStar.twoSort(new String[] { "hello" }));
        // System.out.println("=====KATA5_SORT AND STAR TEST END=====");
    }
}
