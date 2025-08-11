package kata06_reverseList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseListTest {

    @Test
    public void invierteListaConVariosElementos() {
        System.out.println("=====KATA06_REVERT LIST=======");
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(4, 3, 2, 1);
        assertEquals(expected, ReverseList.reverse(input));
    }

    @Test
    public void invierteOtraLista() {
        List<Integer> input = Arrays.asList(9, 2, 0, 7);
        List<Integer> expected = Arrays.asList(7, 0, 2, 9);
        assertEquals(expected, ReverseList.reverse(input));
    }

    @Test
    public void listaVacia() {
        List<Integer> input = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, ReverseList.reverse(input));
    }

    @Test
    public void unSoloElemento() {
        List<Integer> input = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, ReverseList.reverse(input));
    }
}
