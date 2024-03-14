package org.example.trigonometric;

public class TanCalculator {
    private final SinCalculator sin;
    private final CosCalculator cos;

    public TanCalculator(double precision, SinCalculator sin, CosCalculator cos) {
        super(precision);
        this.sin = sin;
        this.cos = cos;
    }

    public double calculate(double x) {
        double tan = sin.calc(x) / cos.calc(x);
        return Double.isFinite(tan) ? tan : Double.POSITIVE_INFINITY;
    }
}
