import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd_WithPositiveNumbers() {
        int result = calculator.add(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    public void testAdd_WithNegativeNumbers() {
        int result = calculator.add(-2, -3);
        assertEquals(-5, result, "-2 + -3 should equal -5");
    }

    @Test
    public void testAdd_WithMixedNumbers() {
        int result = calculator.add(-2, 3);
        assertEquals(1, result, "-2 + 3 should equal 1");
    }

    @Test
    public void testAdd_WithZero() {
        int result = calculator.add(0, 5);
        assertEquals(5, result, "0 + 5 should equal 5");
        
        result = calculator.add(5, 0);
        assertEquals(5, result, "5 + 0 should equal 5");
        
        result = calculator.add(0, 0);
        assertEquals(0, result, "0 + 0 should equal 0");
    }
}