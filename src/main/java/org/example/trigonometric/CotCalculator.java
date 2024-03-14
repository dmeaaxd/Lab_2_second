package org.example.trigonometric;

import org.example.Calculator;
import org.example.CsvHandler;

public class CotCalculator extends Calculator {
    private final SinCalculator sin;
    private final CosCalculator cos;

    public CotCalculator(double precision, SinCalculator sin, CosCalculator cos) {
        super(precision);
        this.sin = sin;
        this.cos = cos;
    }

    public double calc(double x) {
        double result = cos.calc(x) / sin.calc(x);
        CsvHandler.writeToCsv("cot", x, result);
        return result;
    }
}
