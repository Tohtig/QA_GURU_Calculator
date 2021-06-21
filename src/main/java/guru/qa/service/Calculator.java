package guru.qa.service;

public class Calculator {

    private final Reader reader;
    private final Writer writer;

    public Calculator(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.handleString(Messages.TITLE.getMessage());
        writer.handleString(Messages.ENTER_FIRST_ARGUMENT.getMessage());
        int first = reader.readFirstArg();
        writer.handleString(Messages.ENTER_SECOND_ARGUMENT.getMessage());
        int second = reader.readSecondArg();
        writer.handleString(Messages.ENTER_OPERATION.getMessage());
        Operation po = reader.readMathOperation();
        int result = po.getOperation().invoke(first, second);
        writer.handleString(Messages.RESULT.getMessage());
        return first + " " + po.getSymbol() + " " + second + " = " + result;
    }
}
