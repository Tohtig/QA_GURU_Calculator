package guru.qa.service.mock;

import guru.qa.service.Writer;

public class MockConsoleWriter implements Writer {
    @Override
    public String handleString(String inputString) {
        return inputString;
    }
}
