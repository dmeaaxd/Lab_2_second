package org.example;
import org.example.logarithmic.LnCalculator;
import org.example.logarithmic.LogCalculator;
import org.example.trigonometric.SinCalculator;
import org.example.trigonometric.CosCalculator;
import org.example.trigonometric.TanCalculator;
import org.example.trigonometric.CotCalculator;

public class FunctionsSystem extends Calculator{

    private final LnCalculator ln;
    private final LogCalculator log3;
    private final LogCalculator log5;
    private final LogCalculator log10;
    private final TanCalculator tan;
    private final CotCalculator cot;

    public FunctionsSystem(double precision, LnCalculator ln, LogCalculator log3, LogCalculator log5, LogCalculator log10, SinCalculator sin, CosCalculator cos, TanCalculator tan, CotCalculator cot) {
        super(precision);
        this.ln = ln;
        this.log3 = log3;
        this.log5 = log5;
        this.log10 = log10;
        this.tan = tan;
        this.cot = cot;
    }

    public double calc(double x){
        CsvHandler.openFile("logs.csv");

        double result = 0;

        if (x <= 0){
            result = Math.pow((cot.calc(x) / tan.calc(x)), 2);
        }
        else{
            double first = Math.pow(Math.pow(log5.calc(x), 2) / log3.calc(x), 3)
                    / (log10.calc(x) * ln.calc(x) * log10.calc(x));
            double second = Math.pow(Math.pow(log10.calc(x), 3) * log10.calc(x), 2) + (log10.calc(x) * log3.calc(x));
            result = first * second;
        }

        CsvHandler.closeAndSave();
        return result;
    }
}
