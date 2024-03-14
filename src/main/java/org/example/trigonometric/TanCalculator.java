package org.example.trigonometric;

import org.example.Calculator;

public class TanCalculator extends Calculator {
    private final SinCalculator sin;
    private final CosCalculator cos;

    public TanCalculator(double precision, SinCalculator sin, CosCalculator cos) {
        super(precision);
        this.sin = sin;
        this.cos = cos;
    }

    public double calc(double x) {
        return sin.calc(x) / cos.calc(x);
    }
}
