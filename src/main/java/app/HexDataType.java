package app;

import ua.goit.java.calculator.lib.ValueParser;

/**
 * Created by Roman D. on 28.07.2016.
 */
public class HexDataType implements ValueParser {
    @Override
    public double parse(String s) throws NumberFormatException{
        return Integer.parseInt(s, 16);
    }

    @Override
    public String getString(double v) {
        return null;
    }

    @Override
    public void setPrecision(int i) {

    }

    @Override
    public char dataTypeIdentitySymbol() {
        return 'h';
    }
}
