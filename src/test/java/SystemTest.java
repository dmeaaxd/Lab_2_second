import org.example.FunctionsSystem;
import org.example.logarithmic.LnCalculator;
import org.example.logarithmic.LogCalculator;
import org.example.trigonometric.CosCalculator;
import org.example.trigonometric.CotCalculator;
import org.example.trigonometric.SinCalculator;
import org.example.trigonometric.TanCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SystemTest {
    private static final double DELTA = 1e-10;

    @ParameterizedTest
    @CsvSource(value = {
            "0, Infinity",
            "3.1415926535897932, 0.211048642682738188",
            "-1.57079632679489, 0"
    })
    public void testFunctionSystem(double x, double res) {
        FunctionsSystem function = new FunctionsSystem(DELTA,
                new LnCalculator(DELTA),
                new LogCalculator(DELTA, new LnCalculator(DELTA),3),
                new LogCalculator(DELTA, new LnCalculator(DELTA),5),
                new LogCalculator(DELTA, new LnCalculator(DELTA),10),
                new SinCalculator(DELTA),
                new CosCalculator(DELTA),
                new TanCalculator(DELTA, new SinCalculator(DELTA), new CosCalculator(DELTA)),
                new CotCalculator(DELTA, new SinCalculator(DELTA), new CosCalculator(DELTA)));
        double actual = function.calc(x);
        Assertions.assertEquals(res, actual, DELTA);
    }
}
