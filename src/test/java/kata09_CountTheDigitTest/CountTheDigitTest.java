package kata09_CountTheDigitTest;

import kata09_CountTheDigit.CountTheDigit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheDigitTest {

    @Test
    void n10_d1_returns4() {
        System.out.println("=====KATA09_CountTheDigits=======");
        assertEquals(4, CountTheDigit.nbDig(10, 1));
    }

    @Test
    void n25_d1_returns11() {
        assertEquals(11, CountTheDigit.nbDig(25, 1));
    }

    @Test
    void boundary_n0_d0_returns1() {
        assertEquals(1, CountTheDigit.nbDig(0, 0));
    }
}
