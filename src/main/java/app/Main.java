package app;

import ua.goit.java.calculator.lib.Calculator;

import java.util.Scanner;

/**
 * Created by Roman D. on 28.07.2016.
 */
public class Main {

    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public static void main(String[] args) {


    }


    public void execute() {
        calculator.addNewBinaryOperation(new OperationDivide());
        calculator.addNewBinaryOperation(new OperationMultiple());
        calculator.addNewUnaryOperation(new OperationFactorial());

        calculator.addNewValueParser(new HexDataType());

        double result;

        for (; ; ) {
            System.out.println("Enter expression (or type 'X' for exit) -> ");

            String line = new Scanner(System.in).nextLine();

            if (line.equals('X')) {
                break;
            }

            try {
                result = calculator.compute(line);
                System.out.println(line + " = " + result);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
