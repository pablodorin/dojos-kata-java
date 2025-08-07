package kata03_detectPangram;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DetectPangramTest {
    @Test
    public void testClassicPangram() {
        System.out.println("=====KATA03_DetectPangram executing=====");
        assertTrue(DetectPangram.isPangram("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void testMissingLetters() {
        assertFalse(DetectPangram.isPangram("The quick brown fox jumps over the dog"));
    }

    @Test
    public void testEmptyString() {
        assertFalse(DetectPangram.isPangram(""));
    }

    @Test
    public void testWithPunctuation() {
        assertTrue(DetectPangram.isPangram("Pack my box with five dozen liquor jugs!"));
    }

    @Test
    public void testIncompleteEvenWithPunctuation() {
        assertFalse(DetectPangram.isPangram("Pack my box with five liquor jugs!"));
    }
}
