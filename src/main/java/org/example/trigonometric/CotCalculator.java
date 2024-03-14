package org.example.trigonometric;

public class CotCalculator {
    private final SinCalculator sin;
    private final CosCalculator cos;

    public CotCalculator(double precision, SinCalculator sin, CosCalculator cos) {
        super(precision);
        this.sin = sin;
        this.cos = cos;
    }

    public double calculate(double x) {
        double cot = cos.calc(x) / sin.calc(x);
        return Double.isFinite(cot) ? cot : Double.POSITIVE_INFINITY;
    }
}
