package lab2.trigonometric;

import static java.lang.Double.NaN;
import static java.lang.Math.PI;
import static org.mockito.Mockito.*;

public class TrigonometryMocks {
    public static SinCalculator getSinMock() {
        var m = mock(SinCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(0.49999999999999994);
        when(m.calculate(eq(1 * PI / 4))).thenReturn(0.7071067811865475);
        when(m.calculate(eq(1 * PI / 3))).thenReturn(0.8660254037844386);
        when(m.calculate(eq(2 * PI / 3))).thenReturn(0.8660254037844387);
        when(m.calculate(eq(3 * PI / 4))).thenReturn(0.7071067811865476);
        when(m.calculate(eq(5 * PI / 6))).thenReturn(0.49999999999999994);
        when(m.calculate(eq(7 * PI / 6))).thenReturn(-0.4999999999999997);
        when(m.calculate(eq(5 * PI / 4))).thenReturn(-0.7071067811865475);
        when(m.calculate(eq(4 * PI / 3))).thenReturn(-0.8660254037844384);
        when(m.calculate(eq(5 * PI / 3))).thenReturn(-0.8660254037844386);
        when(m.calculate(eq(7 * PI / 4))).thenReturn(-0.7071067811865477);
        when(m.calculate(eq(11 * PI / 6))).thenReturn(-0.5000000000000004);
        when(m.calculate(eq(PI))).thenReturn(0.0);
        when(m.calculate(eq(2 * PI))).thenReturn(0.0);
        when(m.calculate(eq(1 * PI / 2))).thenReturn(1.0);
        when(m.calculate(eq(-1 * PI / 2))).thenReturn(-1.0);
        when(m.calculate(eq(-1 * PI / 4))).thenReturn(-0.7071067811865475);
        when(m.calculate(eq(-3 * PI / 4))).thenReturn(-0.7071067811865476);
        when(m.calculate(eq(-PI))).thenReturn(0.0);
        when(m.calculate(eq(-5 * PI / 4))).thenReturn(0.7071067811865475);
        when(m.calculate(eq(-7 * PI / 4))).thenReturn(0.7071067811865477);


        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static CosCalculator getCosMock() {
        var m = mock(CosCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(0.8660254037844387);
        when(m.calculate(eq(1 * PI / 4))).thenReturn(0.7071067811865476);
        when(m.calculate(eq(1 * PI / 3))).thenReturn(0.5000000000000001);
        when(m.calculate(eq(2 * PI / 3))).thenReturn(-0.4999999999999998);
        when(m.calculate(eq(3 * PI / 4))).thenReturn(-0.7071067811865475);
        when(m.calculate(eq(5 * PI / 6))).thenReturn(-0.8660254037844387);
        when(m.calculate(eq(7 * PI / 6))).thenReturn(-0.8660254037844388);
        when(m.calculate(eq(5 * PI / 4))).thenReturn(-0.7071067811865477);
        when(m.calculate(eq(4 * PI / 3))).thenReturn(-0.5000000000000004);
        when(m.calculate(eq(5 * PI / 3))).thenReturn(0.5000000000000001);
        when(m.calculate(eq(7 * PI / 4))).thenReturn(0.7071067811865474);
        when(m.calculate(eq(11 * PI / 6))).thenReturn(0.8660254037844384);
        when(m.calculate(eq(PI))).thenReturn(-1.0);
        when(m.calculate(eq(2 * PI))).thenReturn(1.0);
        when(m.calculate(eq(1 * PI / 2))).thenReturn(0.0);
        when(m.calculate(eq(-1 * PI / 2))).thenReturn(0.0);
        when(m.calculate(eq(-1 * PI / 4))).thenReturn(0.7071067811865476);
        when(m.calculate(eq(-3 * PI / 4))).thenReturn(-0.7071067811865475);
        when(m.calculate(eq(-PI))).thenReturn(-1.0);
        when(m.calculate(eq(-5 * PI / 4))).thenReturn(-0.7071067811865477);
        when(m.calculate(eq(-7 * PI / 4))).thenReturn(0.7071067811865474);

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static SecCalculator getSecMock() {
        var m = mock(SecCalculator.class); // todo
        when(m.calculate(eq(-PI))).thenReturn(-1d);
        return m;
    }

    public static CosecCalculator getCosecMock() {
        var m = mock(CosecCalculator.class);

        when(m.calculate(eq(0.0))).thenReturn(Double.POSITIVE_INFINITY);
        when(m.calculate(eq(-PI))).thenReturn(Double.POSITIVE_INFINITY);
        when(m.calculate(eq(-PI / 2))).thenReturn(-1.0);
        when(m.calculate(eq(PI / 2))).thenReturn(1.0);
        when(m.calculate(eq(PI))).thenReturn(Double.POSITIVE_INFINITY);
        when(m.calculate(eq(2 * PI))).thenReturn(Double.POSITIVE_INFINITY);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(2.0000000000000004);
        when(m.calculate(eq(1 * PI / 4))).thenReturn(1.4142135623730951);
        when(m.calculate(eq(1 * PI / 3))).thenReturn(1.1547005383792517);
        when(m.calculate(eq(2 * PI / 3))).thenReturn(1.1547005383792515);
        when(m.calculate(eq(3 * PI / 4))).thenReturn(1.414213562373095);
        when(m.calculate(eq(5 * PI / 6))).thenReturn(2.0000000000000004);
        when(m.calculate(eq(7 * PI / 6))).thenReturn(-2.0000000000000013);
        when(m.calculate(eq(5 * PI / 4))).thenReturn(-1.4142135623730951);
        when(m.calculate(eq(4 * PI / 3))).thenReturn(-1.154700538379252);
        when(m.calculate(eq(5 * PI / 3))).thenReturn(-1.1547005383792517);
        when(m.calculate(eq(7 * PI / 4))).thenReturn(-1.4142135623730947);
        when(m.calculate(eq(11 * PI / 6))).thenReturn(-1.9999999999999982);
        when(m.calculate(eq(-1 * PI / 4))).thenReturn(-1.4142135623730951);
        when(m.calculate(eq(-3 * PI / 4))).thenReturn(-1.414213562373095);
        when(m.calculate(eq(-5 * PI / 4))).thenReturn(1.4142135623730951);
        when(m.calculate(eq(-7 * PI / 4))).thenReturn(1.4142135623730947);


        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
}
