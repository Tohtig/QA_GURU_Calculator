package guru.qa.service.impl;

import guru.qa.service.OperationHandler;

public class PowOperationHandler implements OperationHandler {

    @Override
    public double invoke(int first, int second) {
        return Math.pow(first, second);
    }

}
