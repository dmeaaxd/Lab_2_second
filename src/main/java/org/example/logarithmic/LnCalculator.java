package org.example.logarithmic;

import org.example.Calculator;
import org.example.CsvHandler;

public class LnCalculator extends Calculator {

    public LnCalculator(double precision) {
        super(precision);
    }

    @Override
    public double calc(double x) {
        if (x <= 0) {
            return Double.NaN;
        }
        double result = 0;
        double term = (x - 1) / (x + 1);
        double currentTerm = term;
        double lastTerm = term + 10 * precision;
        int n = 1;
        while (Math.abs(currentTerm - lastTerm) > precision) {
            result += currentTerm;
            lastTerm = currentTerm;
            currentTerm *= term * term * (2 * n - 1) / (2 * n + 1);
            n++;
        }
        result *= 2;
        CsvHandler.writeToCsv("ln", x, result);
        return result;
    }
}
