package guru.qa.service.impl;

import guru.qa.service.Writer;

public class ConsoleWriter implements Writer {
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
