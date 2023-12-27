import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void addTwoPositiveNumbers() {
        int a = 2;
        int b = 3;
        Calculator calculate = new Calculator();
        int somme = calculate.add(a, b);
        assertEquals(5, somme);
    }

}


