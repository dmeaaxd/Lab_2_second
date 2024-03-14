package trigonometric;

import org.example.trigonometric.CosCalculator;
import org.example.trigonometric.CotCalculator;
import org.example.trigonometric.SinCalculator;
import org.example.trigonometric.TanCalculator;
import org.mockito.Mockito;

import static java.lang.Double.NaN;
import static java.lang.Math.PI;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TrigonomMock {
    public static SinCalculator getSinMock() {
        SinCalculator sin = mock(SinCalculator.class);

        when(sin.calc(Mockito.eq(0))).thenReturn(0.0);
        when(sin.calc(Mockito.eq(1 * PI / 6))).thenReturn(0.49999999999999994);
        when(sin.calc(Mockito.eq(1 * PI / 4))).thenReturn(0.7071067811865475);
        when(sin.calc(Mockito.eq(1 * PI / 3))).thenReturn(0.8660254037844386);
        when(sin.calc(Mockito.eq(2 * PI / 3))).thenReturn(0.8660254037844387);
        when(sin.calc(Mockito.eq(3 * PI / 4))).thenReturn(0.7071067811865476);
        when(sin.calc(Mockito.eq(5 * PI / 6))).thenReturn(0.49999999999999994);
        when(sin.calc(Mockito.eq(7 * PI / 6))).thenReturn(-0.4999999999999997);
        when(sin.calc(Mockito.eq(5 * PI / 4))).thenReturn(-0.7071067811865475);
        when(sin.calc(Mockito.eq(4 * PI / 3))).thenReturn(-0.8660254037844384);
        when(sin.calc(Mockito.eq(5 * PI / 3))).thenReturn(-0.8660254037844386);
        when(sin.calc(Mockito.eq(7 * PI / 4))).thenReturn(-0.7071067811865477);
        when(sin.calc(Mockito.eq(11 * PI / 6))).thenReturn(-0.5000000000000004);
        when(sin.calc(Mockito.eq(PI))).thenReturn(0.0);
        when(sin.calc(Mockito.eq(2 * PI))).thenReturn(0.0);
        when(sin.calc(Mockito.eq(1 * PI / 2))).thenReturn(1.0);
        when(sin.calc(Mockito.eq(-1 * PI / 2))).thenReturn(-1.0);
        when(sin.calc(Mockito.eq(-1 * PI / 4))).thenReturn(-0.7071067811865475);
        when(sin.calc(Mockito.eq(-3 * PI / 4))).thenReturn(-0.7071067811865476);
        when(sin.calc(Mockito.eq(-PI))).thenReturn(0.0);
        when(sin.calc(Mockito.eq(-5 * PI / 4))).thenReturn(0.7071067811865475);
        when(sin.calc(Mockito.eq(-7 * PI / 4))).thenReturn(0.7071067811865477);


        when(sin.calc(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(sin.calc(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(sin.calc(NaN)).thenReturn(NaN);

        return sin;
    }

    public static CosCalculator getCosMock() {
        CosCalculator cos = mock(CosCalculator.class);

        when(cos.calc(Mockito.eq(0))).thenReturn(1.0);
        when(cos.calc(Mockito.eq(1 * PI / 6))).thenReturn(0.8660254037844387);
        when(cos.calc(Mockito.eq(1 * PI / 4))).thenReturn(0.7071067811865476);
        when(cos.calc(Mockito.eq(1 * PI / 3))).thenReturn(0.5000000000000001);
        when(cos.calc(Mockito.eq(2 * PI / 3))).thenReturn(-0.4999999999999998);
        when(cos.calc(Mockito.eq(3 * PI / 4))).thenReturn(-0.7071067811865475);
        when(cos.calc(Mockito.eq(5 * PI / 6))).thenReturn(-0.8660254037844387);
        when(cos.calc(Mockito.eq(7 * PI / 6))).thenReturn(-0.8660254037844388);
        when(cos.calc(Mockito.eq(5 * PI / 4))).thenReturn(-0.7071067811865477);
        when(cos.calc(Mockito.eq(4 * PI / 3))).thenReturn(-0.5000000000000004);
        when(cos.calc(Mockito.eq(5 * PI / 3))).thenReturn(0.5000000000000001);
        when(cos.calc(Mockito.eq(7 * PI / 4))).thenReturn(0.7071067811865474);
        when(cos.calc(Mockito.eq(11 * PI / 6))).thenReturn(0.8660254037844384);
        when(cos.calc(Mockito.eq(PI))).thenReturn(-1.0);
        when(cos.calc(Mockito.eq(2 * PI))).thenReturn(1.0);
        when(cos.calc(Mockito.eq(1 * PI / 2))).thenReturn(0.0);
        when(cos.calc(Mockito.eq(-1 * PI / 2))).thenReturn(0.0);
        when(cos.calc(Mockito.eq(-1 * PI / 4))).thenReturn(0.7071067811865476);
        when(cos.calc(Mockito.eq(-3 * PI / 4))).thenReturn(-0.7071067811865475);
        when(cos.calc(Mockito.eq(-PI))).thenReturn(-1.0);
        when(cos.calc(Mockito.eq(-5 * PI / 4))).thenReturn(-0.7071067811865477);
        when(cos.calc(Mockito.eq(-7 * PI / 4))).thenReturn(0.7071067811865474);

        when(cos.calc(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(cos.calc(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(cos.calc(NaN)).thenReturn(NaN);

        return cos;
    }

    public static TanCalculator getTanMock() {
        TanCalculator tan = mock(TanCalculator.class);

        when(tan.calc(Mockito.eq(PI / 2))).thenReturn(Double.POSITIVE_INFINITY);
        when(tan.calc(Mockito.eq(- PI / 2))).thenReturn(Double.POSITIVE_INFINITY);
        when(tan.calc(Mockito.eq(PI))).thenReturn(0.0);
        when(tan.calc(Mockito.eq(2 * PI))).thenReturn(0.0);
        when(tan.calc(Mockito.eq(-PI))).thenReturn(0.0);

        when(tan.calc(Mockito.eq(1 * PI / 6))).thenReturn(0.5773502691896257);
        when(tan.calc(Mockito.eq(1 * PI / 4))).thenReturn(0.9999999999999999);
        when(tan.calc(Mockito.eq(1 * PI / 3))).thenReturn(1.7320508075688767);
        when(tan.calc(Mockito.eq(2 * PI / 3))).thenReturn(-1.7320508075688783);
        when(tan.calc(Mockito.eq(3 * PI / 4))).thenReturn(-1.0000000000000002);
        when(tan.calc(Mockito.eq(5 * PI / 6))).thenReturn(-0.5773502691896257);
        when(tan.calc(Mockito.eq(7 * PI / 6))).thenReturn(0.5773502691896254);
        when(tan.calc(Mockito.eq(5 * PI / 4))).thenReturn(0.9999999999999997);
        when(tan.calc(Mockito.eq(4 * PI / 3))).thenReturn(1.7320508075688754);
        when(tan.calc(Mockito.eq(5 * PI / 3))).thenReturn(-1.732050807568877);
        when(tan.calc(Mockito.eq(7 * PI / 4))).thenReturn(-1.0000000000000004);
        when(tan.calc(Mockito.eq(11 * PI / 6))).thenReturn(-0.5773502691896265);
        when(tan.calc(Mockito.eq(-1 * PI / 4))).thenReturn(-0.9999999999999999);
        when(tan.calc(Mockito.eq(-3 * PI / 4))).thenReturn(1.0000000000000002);
        when(tan.calc(Mockito.eq(-5 * PI / 4))).thenReturn(-0.9999999999999997);
        when(tan.calc(Mockito.eq(-7 * PI / 4))).thenReturn(1.0000000000000004);


        when(tan.calc(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(tan.calc(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(tan.calc(NaN)).thenReturn(NaN);

        return tan;
    }

    public static CotCalculator getCotMock() {
        CotCalculator cot = mock(CotCalculator.class);

        when(cot.calc(Mockito.eq(PI / 2))).thenReturn(0.0);
        when(cot.calc(Mockito.eq(- PI / 2))).thenReturn(0.0);
        when(cot.calc(Mockito.eq(PI))).thenReturn(NaN);
        when(cot.calc(Mockito.eq(2 * PI))).thenReturn(NaN);
        when(cot.calc(Mockito.eq(-PI))).thenReturn(NaN);

        when(cot.calc(Mockito.eq(1 * PI / 6))).thenReturn(1.73205080757);
        when(cot.calc(Mockito.eq(1 * PI / 4))).thenReturn(1.0);
        when(cot.calc(Mockito.eq(1 * PI / 3))).thenReturn(0.57735026919);
        when(cot.calc(Mockito.eq(2 * PI / 3))).thenReturn(-0.57735026919);
        when(cot.calc(Mockito.eq(3 * PI / 4))).thenReturn(-1.0);
        when(cot.calc(Mockito.eq(5 * PI / 6))).thenReturn(-1.73205080757);
        when(cot.calc(Mockito.eq(7 * PI / 6))).thenReturn(1.73205080757);
        when(cot.calc(Mockito.eq(5 * PI / 4))).thenReturn(1.0);
        when(cot.calc(Mockito.eq(4 * PI / 3))).thenReturn(0.57735026919);
        when(cot.calc(Mockito.eq(5 * PI / 3))).thenReturn(-0.57735026919);
        when(cot.calc(Mockito.eq(7 * PI / 4))).thenReturn(-1.0);
        when(cot.calc(Mockito.eq(11 * PI / 6))).thenReturn(-1.73205080757);
        when(cot.calc(Mockito.eq(-1 * PI / 4))).thenReturn(-1.0);
        when(cot.calc(Mockito.eq(-3 * PI / 4))).thenReturn(1.0);
        when(cot.calc(Mockito.eq(-5 * PI / 4))).thenReturn(-1.0);
        when(cot.calc(Mockito.eq(-7 * PI / 4))).thenReturn(1.0);


        when(cot.calc(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(cot.calc(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(cot.calc(NaN)).thenReturn(NaN);

        return cot;
    }
}
