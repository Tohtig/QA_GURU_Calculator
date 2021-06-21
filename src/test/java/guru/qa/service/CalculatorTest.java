package guru.qa.service;

import guru.qa.service.mock.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void calculatorMultiTest() {
        calculator = new Calculator(new MockMultiReader(), new MockConsoleWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }

    @Test
    void calculatorSumTest() {
        calculator = new Calculator(new MockSumReader(), new MockConsoleWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("3 + 5 = 8", result);
    }

    @Test
    void calculatorMinusTest() {
        calculator = new Calculator(new MockMinusReader(), new MockConsoleWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("5 - 3 = 2", result);
    }

    @Test
    void calculatorPowTest() {
        calculator = new Calculator(new MockPowReader(), new MockConsoleWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("3 ^ 4 = 81", result);
    }

    @Test
    void calculatorDivideTest() {
        calculator = new Calculator(new MockDivideReader(), new MockConsoleWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("25 / 5 = 5", result);
    }
}