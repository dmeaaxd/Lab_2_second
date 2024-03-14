package trigonometric;

import org.example.CsvHandler;
import org.example.trigonometric.CosCalculator;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;

public class CosTest {
    private static final double DELTA = 1e-10;
    private static CosCalculator cos;

    @BeforeClass
    public static void init(){
        cos = new CosCalculator(DELTA);
        CsvHandler.openFile("logs.csv");
    }

    @AfterClass
    public static void exit(){
        CsvHandler.closeAndSave();
    }

    @Test
    public void testCosZero() {
        assertEquals(Math.cos(0), cos.calc(0), DELTA);
    }

    @Test
    public void testCosPositiveValue() {
        assertEquals(Math.cos(1), cos.calc(1), DELTA);
    }

    @Test
    public void testCosNegativeValue() {
        assertEquals(Math.cos(-1), cos.calc(-1), DELTA);
    }

    @Test
    public void testCosPi() {
        assertEquals(Math.cos(Math.PI), cos.calc(Math.PI), DELTA);
    }
}
