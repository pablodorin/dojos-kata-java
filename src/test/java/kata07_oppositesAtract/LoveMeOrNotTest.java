package kata07_oppositesAtract;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoveMeOrNotTest {

    @Test
    public void testAreWeInLove() {
        // uno par y otro impar -> true
        System.out.println("=====KATA07_Opposites Atract=======");
        assertTrue(LoveMeOrNot.isLove(4, 7));

        // ambos pares -> false
        assertFalse(LoveMeOrNot.isLove(2, 8));

        // ambos impares -> false
        assertFalse(LoveMeOrNot.isLove(5, 9));

        // uno impar y otro par -> true
        assertTrue(LoveMeOrNot.isLove(1, 4));

        // extremos -> true
        assertTrue(LoveMeOrNot.isLove(0, 3));
    }
}
