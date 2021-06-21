package guru.qa.service;

import guru.qa.service.mock.MockConsoleWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConsoleWriterTest {
    @Test
    void TitleMessageTest() {
        MockConsoleWriter mockConsoleWriter = new MockConsoleWriter();
        Assertions.assertEquals("This is the best calculator in the world!",
                mockConsoleWriter.handleString(Messages.TITLE.getMessage()));
    }

    @Test
    void FirstArgumentMessageTest() {
        MockConsoleWriter mockConsoleWriter = new MockConsoleWriter();
        Assertions.assertEquals("Please enter first argument:",
                mockConsoleWriter.handleString(Messages.ENTER_FIRST_ARGUMENT.getMessage()));
    }

    @Test
    void SecondArgumentMessageTest() {
        MockConsoleWriter mockConsoleWriter = new MockConsoleWriter();
        Assertions.assertEquals("Please enter second argument:",
                mockConsoleWriter.handleString(Messages.ENTER_SECOND_ARGUMENT.getMessage()));
    }

    @Test
    void OperationMessageTest() {
        MockConsoleWriter mockConsoleWriter = new MockConsoleWriter();
        Assertions.assertEquals("Please enter operation (+ - / * ^)",
                mockConsoleWriter.handleString(Messages.ENTER_OPERATION.getMessage()));

    }

    @Test
    void ResultMessageTest() {
        MockConsoleWriter mockConsoleWriter = new MockConsoleWriter();
        Assertions.assertEquals("Result:",
                mockConsoleWriter.handleString(Messages.RESULT.getMessage()));

    }

}