package trigonometric;

import org.example.CsvHandler;
import org.example.trigonometric.TanCalculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TanTest {
    private static final double DELTA = 1e-10;
    private static TanCalculator tan;

    @BeforeClass
    public static void init(){
        tan = new TanCalculator(DELTA, TrigonomMock.getSinMock(), TrigonomMock.getCosMock());
        CsvHandler.openFile("logs.csv");
    }

    @AfterClass
    public static void exit(){
        CsvHandler.closeAndSave();
    }

    @Test
    public void testTanZero() {
        assertEquals(Math.tan(0), tan.calc(0), DELTA);
    }

    @Test
    public void testTanPositiveValue() {
        assertEquals(Math.tan(Math.PI), tan.calc(Math.PI), DELTA);
    }

    @Test
    public void testTanNegativeValue() {
        assertEquals(Math.tan(-Math.PI), tan.calc(-Math.PI), DELTA);
    }
}
