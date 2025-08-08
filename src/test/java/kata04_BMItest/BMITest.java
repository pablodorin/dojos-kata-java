package kata04_BMItest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// importa la clase de producción, que está en otro package
import kata04_bmi.BMI;

public class BMITest {

    @Test
    public void testUnderweight() {
        System.out.println("=====KATA04_BMI executing=====");
        assertEquals("Underweight", BMI.bmi(50, 1.8));
    }

    @Test
    public void testNormal() {
        assertEquals("Normal", BMI.bmi(70, 1.75));
    }

    @Test
    public void testOverweight() {
        assertEquals("Overweight", BMI.bmi(85, 1.75));
    }

    @Test
    public void testObese() {
        assertEquals("Obese", BMI.bmi(110, 1.75));
    }

    @Test
    public void testBoundary_18_5() {
        assertEquals("Underweight", BMI.bmi(53.465, 1.70));
    }

    @Test
    public void testBoundary_25_0() {
        assertEquals("Normal", BMI.bmi(81.0, 1.80));
    }

    @Test
    public void testBoundary_30_0() {
        assertEquals("Overweight", BMI.bmi(91.875, 1.75));
    }
}
