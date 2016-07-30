package ua.goit.java.calculator.app;

import ua.goit.java.calculator.lib.UnaryOperation;

/**
 * Created by Roman D. on 28.07.2016.
 */
public class OperationFactorial implements UnaryOperation {
    @Override
    public double calculate(double v) {

        int result = 1;
        for (int i = 2; i <= v; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public char getOperator() {
        return 'f';
    }
}
