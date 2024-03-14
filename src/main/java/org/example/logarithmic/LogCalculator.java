package org.example.logarithmic;

import org.example.Calculator;
import org.example.CsvHandler;

public class LogCalculator extends Calculator {
    private final LnCalculator ln;
    private final int base;

    public LogCalculator(double precision, LnCalculator ln, int base) {
        super(precision);
        this.ln = ln;
        this.base = base;
    }

    @Override
    public double calc(double x) {
        if (base <= 0 || x <= 0) {
            return Double.NaN;
        }
        double result = ln.calc(x) / ln.calc(base);
        CsvHandler.writeToCsv("log"+(int)base, x, result);
        return result;
    }
}
