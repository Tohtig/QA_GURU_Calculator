package guru.qa.service.impl;

import guru.qa.service.OperationHandler;

public class DivideOperationHandler implements OperationHandler {

    @Override
    public double invoke(int first, int second) {
        return first / second;
    }

}
