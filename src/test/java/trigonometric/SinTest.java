package trigonometric;

import org.example.CsvHandler;
import org.example.trigonometric.SinCalculator;
import org.junit.AfterClass;
import org.junit.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertEquals;

public class SinTest {
    private static final double DELTA = 1e-10;
    private static SinCalculator sin;

    @BeforeClass
    public static void init(){
        sin = new SinCalculator(DELTA);
        CsvHandler.openFile("logs.csv");
    }

    @AfterClass
    public static void exit(){
        CsvHandler.closeAndSave();
    }

    @Test
    public void testSinZero() {
        assertEquals(Math.sin(0), sin.calc(0), DELTA);
    }

    @Test
    public void testSinPositiveValue() {
        assertEquals(Math.sin(1), sin.calc(1), DELTA);
    }

    @Test
    public void testSinNegativeValue() {
        assertEquals(Math.sin(-1), sin.calc(-1), DELTA);
    }

    @Test
    public void testSinPi() {
        assertEquals(Math.sin(Math.PI), sin.calc(Math.PI), DELTA);
    }

}
