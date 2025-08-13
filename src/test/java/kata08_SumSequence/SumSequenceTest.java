package kata08_SumSequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumSequenceTest {

    @Test
    public void testSameBeginAndEnd() {
        assertEquals(2, SumSequence.sequenceSum(2, 2, 2));
    }

    @Test
    public void testNormalStep() {
        System.out.println("=====KATA08_SumSequence=======");
        assertEquals(12, SumSequence.sequenceSum(2, 6, 2));
    }

    @Test
    public void testStepOne() {
        assertEquals(15, SumSequence.sequenceSum(1, 5, 1));
    }

    @Test
    public void testStepGreaterThanRange() {
        assertEquals(5, SumSequence.sequenceSum(1, 5, 3));
    }

    @Test
    public void testBeginGreaterThanEnd() {
        assertEquals(0, SumSequence.sequenceSum(10, 5, 2));
    }
}
