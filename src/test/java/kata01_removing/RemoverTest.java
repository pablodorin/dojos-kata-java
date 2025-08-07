package kata01_removing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoverTest {

    @Test
    public void testRemove() {
        System.out.println("=====KATA01_RemoverTest executing=====");
        String input = "Hola!";
        String expected = "Hola";
        String result = Remover.remove(input);
        assertEquals(expected, result);
    }
}
