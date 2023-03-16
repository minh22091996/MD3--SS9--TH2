package rikkei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute0() {
        int number = -2;
        int expected = 2;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
    assertEquals(expected,result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 3;
        int expected = 3;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }


}