package lab2.trigonometric;

import org.mockito.Mockito;

import static java.lang.Double.NaN;
import static java.lang.Math.PI;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TrigonometryMocks {
    public static SinCalculator getSinMock() {
        SinCalculator sin = mock(SinCalculator.class);

        when(sin.calculate(Mockito.eq(1 * PI / 6))).thenReturn(0.49999999999999994);
        when(sin.calculate(Mockito.eq(1 * PI / 4))).thenReturn(0.7071067811865475);
        when(sin.calculate(Mockito.eq(1 * PI / 3))).thenReturn(0.8660254037844386);
        when(sin.calculate(Mockito.eq(2 * PI / 3))).thenReturn(0.8660254037844387);
        when(sin.calculate(Mockito.eq(3 * PI / 4))).thenReturn(0.7071067811865476);
        when(sin.calculate(Mockito.eq(5 * PI / 6))).thenReturn(0.49999999999999994);
        when(sin.calculate(Mockito.eq(7 * PI / 6))).thenReturn(-0.4999999999999997);
        when(sin.calculate(Mockito.eq(5 * PI / 4))).thenReturn(-0.7071067811865475);
        when(sin.calculate(Mockito.eq(4 * PI / 3))).thenReturn(-0.8660254037844384);
        when(sin.calculate(Mockito.eq(5 * PI / 3))).thenReturn(-0.8660254037844386);
        when(sin.calculate(Mockito.eq(7 * PI / 4))).thenReturn(-0.7071067811865477);
        when(sin.calculate(Mockito.eq(11 * PI / 6))).thenReturn(-0.5000000000000004);
        when(sin.calculate(Mockito.eq(PI))).thenReturn(0.0);
        when(sin.calculate(Mockito.eq(2 * PI))).thenReturn(0.0);
        when(sin.calculate(Mockito.eq(1 * PI / 2))).thenReturn(1.0);
        when(sin.calculate(Mockito.eq(-1 * PI / 2))).thenReturn(-1.0);
        when(sin.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(-0.7071067811865475);
        when(sin.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(-0.7071067811865476);
        when(sin.calculate(Mockito.eq(-PI))).thenReturn(0.0);
        when(sin.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(0.7071067811865475);
        when(sin.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(0.7071067811865477);


        when(sin.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(sin.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(sin.calculate(NaN)).thenReturn(NaN);

        return sin;
    }

    public static CosCalculator getCosMock() {
        CosCalculator cos = mock(CosCalculator.class);

        when(cos.calculate(Mockito.eq(1 * PI / 6))).thenReturn(0.8660254037844387);
        when(cos.calculate(Mockito.eq(1 * PI / 4))).thenReturn(0.7071067811865476);
        when(cos.calculate(Mockito.eq(1 * PI / 3))).thenReturn(0.5000000000000001);
        when(cos.calculate(Mockito.eq(2 * PI / 3))).thenReturn(-0.4999999999999998);
        when(cos.calculate(Mockito.eq(3 * PI / 4))).thenReturn(-0.7071067811865475);
        when(cos.calculate(Mockito.eq(5 * PI / 6))).thenReturn(-0.8660254037844387);
        when(cos.calculate(Mockito.eq(7 * PI / 6))).thenReturn(-0.8660254037844388);
        when(cos.calculate(Mockito.eq(5 * PI / 4))).thenReturn(-0.7071067811865477);
        when(cos.calculate(Mockito.eq(4 * PI / 3))).thenReturn(-0.5000000000000004);
        when(cos.calculate(Mockito.eq(5 * PI / 3))).thenReturn(0.5000000000000001);
        when(cos.calculate(Mockito.eq(7 * PI / 4))).thenReturn(0.7071067811865474);
        when(cos.calculate(Mockito.eq(11 * PI / 6))).thenReturn(0.8660254037844384);
        when(cos.calculate(Mockito.eq(PI))).thenReturn(-1.0);
        when(cos.calculate(Mockito.eq(2 * PI))).thenReturn(1.0);
        when(cos.calculate(Mockito.eq(1 * PI / 2))).thenReturn(0.0);
        when(cos.calculate(Mockito.eq(-1 * PI / 2))).thenReturn(0.0);
        when(cos.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(0.7071067811865476);
        when(cos.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(-0.7071067811865475);
        when(cos.calculate(Mockito.eq(-PI))).thenReturn(-1.0);
        when(cos.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(-0.7071067811865477);
        when(cos.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(0.7071067811865474);

        when(cos.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(cos.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(cos.calculate(NaN)).thenReturn(NaN);

        return cos;
    }

    public static SecCalculator getSecMock() {
        // todo
        return null;
    }

    public static CosecCalculator getCosecMock() {
        CosecCalculator cosec = mock(CosecCalculator.class);

        when(cosec.calculate(Mockito.eq(0.0))).thenReturn(Double.POSITIVE_INFINITY);
        when(cosec.calculate(Mockito.eq(-PI))).thenReturn(Double.POSITIVE_INFINITY);
        when(cosec.calculate(Mockito.eq(-PI / 2))).thenReturn(-1.0);
        when(cosec.calculate(Mockito.eq(PI / 2))).thenReturn(1.0);
        when(cosec.calculate(Mockito.eq(PI))).thenReturn(Double.POSITIVE_INFINITY);
        when(cosec.calculate(Mockito.eq(2 * PI))).thenReturn(Double.POSITIVE_INFINITY);

        when(cosec.calculate(Mockito.eq(1 * PI / 6))).thenReturn(2.0000000000000004);
        when(cosec.calculate(Mockito.eq(1 * PI / 4))).thenReturn(1.4142135623730951);
        when(cosec.calculate(Mockito.eq(1 * PI / 3))).thenReturn(1.1547005383792517);
        when(cosec.calculate(Mockito.eq(2 * PI / 3))).thenReturn(1.1547005383792515);
        when(cosec.calculate(Mockito.eq(3 * PI / 4))).thenReturn(1.414213562373095);
        when(cosec.calculate(Mockito.eq(5 * PI / 6))).thenReturn(2.0000000000000004);
        when(cosec.calculate(Mockito.eq(7 * PI / 6))).thenReturn(-2.0000000000000013);
        when(cosec.calculate(Mockito.eq(5 * PI / 4))).thenReturn(-1.4142135623730951);
        when(cosec.calculate(Mockito.eq(4 * PI / 3))).thenReturn(-1.154700538379252);
        when(cosec.calculate(Mockito.eq(5 * PI / 3))).thenReturn(-1.1547005383792517);
        when(cosec.calculate(Mockito.eq(7 * PI / 4))).thenReturn(-1.4142135623730947);
        when(cosec.calculate(Mockito.eq(11 * PI / 6))).thenReturn(-1.9999999999999982);
        when(cosec.calculate(Mockito.eq(-1 * PI / 4))).thenReturn(-1.4142135623730951);
        when(cosec.calculate(Mockito.eq(-3 * PI / 4))).thenReturn(-1.414213562373095);
        when(cosec.calculate(Mockito.eq(-5 * PI / 4))).thenReturn(1.4142135623730951);
        when(cosec.calculate(Mockito.eq(-7 * PI / 4))).thenReturn(1.4142135623730947);


        when(cosec.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(cosec.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(cosec.calculate(NaN)).thenReturn(NaN);

        return cosec;
    }

}
