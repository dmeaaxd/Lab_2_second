package org.example.trigonometric;

import org.example.Calculator;

public class CotCalculator extends Calculator {
    private final SinCalculator sin;
    private final CosCalculator cos;

    public CotCalculator(double precision, SinCalculator sin, CosCalculator cos) {
        super(precision);
        this.sin = sin;
        this.cos = cos;
    }

    public double calc(double x) {
        return cos.calc(x) / sin.calc(x);
    }
}
