import logariphmic.LogMock;
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
import trigonometric.TrigonomMock;

public class IntegrationTest {
    private static final double DELTA = 1e-10;

    @ParameterizedTest
    @CsvSource(value = {
            "0, Infinity",
            "3.1415926535897932, 0.211048642682738188",
            "-0.78539816339744830961, 1"
    })
    public void testFunctionSystem_mocAll(double x, double res) {
        FunctionsSystem function = new FunctionsSystem(DELTA,
                LogMock.getLnMock(),
                LogMock.getLog3Mock(),
                LogMock.getLog5Mock(),
                LogMock.getLog10Mock(),
                TrigonomMock.getTanMock(),
                TrigonomMock.getCotMock());
        double actual = function.calc(x);
        Assertions.assertEquals(res, actual, DELTA);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0, Infinity",
            "3.1415926535897932, 0.211048642682738188",
            "-0.78539816339744830961, 1"
    })
    public void testFunctionSystem_mocLog(double x, double res) {
        FunctionsSystem function = new FunctionsSystem(DELTA,
                LogMock.getLnMock(),
                LogMock.getLog3Mock(),
                LogMock.getLog5Mock(),
                LogMock.getLog10Mock(),
                new TanCalculator(DELTA, new SinCalculator(DELTA), new CosCalculator(DELTA)),
                new CotCalculator(DELTA, new SinCalculator(DELTA), new CosCalculator(DELTA)));
        double actual = function.calc(x);
        Assertions.assertEquals(res, actual, DELTA);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0, Infinity",
            "3.1415926535897932, 0.211048642682738188",
            "-0.78539816339744830961, 1"
    })
    public void testFunctionSystem_mocTringon(double x, double res) {
        FunctionsSystem function = new FunctionsSystem(DELTA,
                new LnCalculator(DELTA),
                new LogCalculator(DELTA, new LnCalculator(DELTA),3),
                new LogCalculator(DELTA, new LnCalculator(DELTA),5),
                new LogCalculator(DELTA, new LnCalculator(DELTA),10),
                TrigonomMock.getTanMock(),
                TrigonomMock.getCotMock());
        double actual = function.calc(x);
        Assertions.assertEquals(res, actual, DELTA);
    }
}
