package guru.qa.service.impl;

import guru.qa.service.Writer;

public class ConsoleWriter implements Writer {
    @Override
    public String showMessage(String message) {
        System.out.println(message);
        return message;
    }
}
