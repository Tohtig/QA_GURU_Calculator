package guru.qa.service;

import guru.qa.service.impl.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationHandlerTest {

    private OperationHandler handler;

    @Test
    void sumTest() {
        handler = new SumOperationHandler();
        Assertions.assertEquals(8, handler.invoke(3, 5));
    }

    @Test
    void multTest() {
        handler = new MultOperationHandler();
        Assertions.assertEquals(15, handler.invoke(3, 5));
    }

    @Test
    void minusTest() {
        handler = new MinusOperationHandler();
        Assertions.assertEquals(4, handler.invoke(10, 6));
    }

    @Test
    void divideTest() {
        handler = new DivideOperationHandler();
        Assertions.assertEquals(3, handler.invoke(9, 3));
    }

    @Test
    void powTest() {
        handler = new PowOperationHandler();
        Assertions.assertEquals(81, handler.invoke(3, 4));
    }


}