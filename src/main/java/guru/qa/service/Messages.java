package guru.qa.service;

public enum Messages {
    TITLE("This is the best calculator in the world!"),
    ENTER_FIRST_ARGUMENT("Please enter first argument:"),
    ENTER_SECOND_ARGUMENT("Please enter second argument:"),
    ENTER_OPERATION("Please enter operation (+ - / * ^)"),
    RESULT("Result:");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
