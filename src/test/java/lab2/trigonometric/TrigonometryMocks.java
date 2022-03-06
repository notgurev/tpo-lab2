package lab2.trigonometric;

import static java.lang.Double.NaN;
import static java.lang.Math.PI;
import static org.mockito.Mockito.*;

public class TrigonometryMocks {
    public static SinCalculator getSinMock() {
        var m = mock(SinCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(0.49999999999999994);

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static CosCalculator getCosMock() {
        var m = mock(CosCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(0.8660254037844387);

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static SecCalculator getSecMock() {
        var m = mock(SecCalculator.class); // todo

        when(m.calculate(eq(-PI))).thenReturn(-1d);

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static CosecCalculator getCosecMock() {
        var m = mock(CosecCalculator.class);

        when(m.calculate(eq(0.0))).thenReturn(Double.POSITIVE_INFINITY);

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
}
