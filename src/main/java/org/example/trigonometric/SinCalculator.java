package org.example.trigonometric;

import org.example.Calculator;
import org.example.CsvHandler;

public class SinCalculator extends Calculator {

    public SinCalculator(double precision) {
        super(precision);
    }

    @Override
    public double calc(double x) {
        double result = 0;
        double term = x;
        double lastTerm = term + 10 * precision;
        int n = 1;
        while (Math.abs(term - lastTerm) > precision) {
            result += term;
            lastTerm = term;
            term *= -(x * x) / ((2 * n) * (2 * n + 1));
            n++;
        }
        CsvHandler.writeToCsv("sin", x, result);
        return result;
    }
}
