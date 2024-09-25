import org.example.Main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testFactorial() {
        // Test factorial of 0
        assertEquals(1, Main.factorial(0));

        // Test factorial of 1
        assertEquals(1, Main.factorial(1));

        // Test factorial of 5
        assertEquals(120, Main.factorial(5));

        // Test factorial of 10
        assertEquals(3628800, Main.factorial(10));
    }

    @Test
    public void testSquareRoot() {
        // Test square root of positive numbers
        assertEquals(2, Main.squareRoot(4), 0.0001);
        assertEquals(3, Main.squareRoot(9), 0.0001);

        // Test square root of 0
        assertEquals(0, Main.squareRoot(0), 0.0001);

        // Test square root of a floating-point number
        assertEquals(1.4142, Main.squareRoot(2), 0.0001);
    }

    @Test
    public void testNaturalLog() {
        // Test natural logarithm of e (~2.71828)
        assertEquals(1, Main.naturalLog(Math.E), 0.0001);

        // Test natural logarithm of 1 (should be 0)
        assertEquals(0, Main.naturalLog(1), 0.0001);
    }

    @Test
    public void testPower() {
        // Test power function
        assertEquals(16, Main.power(2, 4), 0.0001);

        // Test power of zero exponent
        assertEquals(1, Main.power(5, 0), 0.0001);

        // Test power with fractional exponents
        assertEquals(2, Main.power(4, 0.5), 0.0001);
    }
}
