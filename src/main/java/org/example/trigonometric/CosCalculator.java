package org.example.trigonometric;

import org.example.Calculator;
import org.example.CsvHandler;

public class CosCalculator extends Calculator  {

    public CosCalculator(double precision) {
        super(precision);
    }

    @Override
    public double calc(double x) {
        double result = 1;
        double term = 1;
        double lastTerm = term + 10 * precision;
        int n = 1;
        while (Math.abs(term - lastTerm) > precision) {
            lastTerm = term;
            term *= -(x * x) / ((2 * n - 1) * (2 * n));
            result += term;
            n++;
        }
        CsvHandler.writeToCsv("cos", x, result);
        return result;
    }
}
