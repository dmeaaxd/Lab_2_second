package org.example.trigonometric;

import org.example.Calculator;
import org.example.CsvHandler;

public class TanCalculator extends Calculator {
    private final SinCalculator sin;
    private final CosCalculator cos;

    public TanCalculator(double precision, SinCalculator sin, CosCalculator cos) {
        super(precision);
        this.sin = sin;
        this.cos = cos;
    }

    public double calc(double x) {
        double result = sin.calc(x) / cos.calc(x);
        CsvHandler.writeToCsv("tan", x, result);
        return result;
    }
}
