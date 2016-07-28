package app;

import ua.goit.java.calculator.lib.BinaryOperation;

/**
 * Created by Roman D. on 28.07.2016.
 */
public class OperationDivide implements BinaryOperation {
    @Override
    public double calculate(double v, double v1) {
        return v / v1;
    }

    @Override
    public char getOperator() {
        return '/';
    }
}
