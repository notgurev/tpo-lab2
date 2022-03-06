package lab2.logariphmic;

import static java.lang.Double.*;
import static java.lang.Math.PI;
import static org.mockito.Mockito.*;

public class LogMock {
    public static LnCalculator getLnMock() {
        var m = mock(LnCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(-0.6470295833786549);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog2Mock() {
        var m = mock(LogBaseCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(-0.9334663712488376);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog3Mock() {
        var m = mock(LogBaseCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(-0.5889517075792716);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog5Mock() {
        var m = mock(LogBaseCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(-0.40202208384670945);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog10Mock() {
        var m = mock(LogBaseCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(-0.2810013776895098);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
}
