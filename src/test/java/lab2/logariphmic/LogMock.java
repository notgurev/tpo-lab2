package lab2.logariphmic;

import lab2.MockChain;

import static java.lang.Double.*;
import static java.lang.Math.PI;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LogMock {
    public static LnCalculator getLnMock() {
        var m = mock(LnCalculator.class);

        MockChain.when(m)
                .mock(0d, NEGATIVE_INFINITY)
                .mock(-4 * PI / 3, NaN)
                .mock(PI / 4, -0.2415644753)
                .mock(PI, 1.1447298858)
                .mock(-PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(2 * PI / 3, 0.7392647777)
                .mock(-PI / 6, NaN)
                .mock(2 * PI, 1.8378770664)
                .mock(-PI / 2, NaN)
                .mock(PI / 2, 0.4515827053)
                .mock(-2 * PI, NaN)
                .mock(-3 * PI / 4, NaN);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog2Mock() {
        var m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(0d, NEGATIVE_INFINITY)
                .mock(-4 * PI / 3, NaN)
                .mock(PI / 4, -0.3485038705)
                .mock(PI, 1.6514961295)
                .mock(-PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(2 * PI / 3, 1.0665336288)
                .mock(-PI / 6, NaN)
                .mock(2 * PI, 2.6514961295)
                .mock(-PI / 2, NaN)
                .mock(PI / 2, 0.6514961295)
                .mock(-2 * PI, NaN)
                .mock(-3 * PI / 4, NaN);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog3Mock() {
        var m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(0d, NEGATIVE_INFINITY)
                .mock(-4 * PI / 3, NaN)
                .mock(PI / 4, -0.3485038705)
                .mock(PI, 1.6514961295)
                .mock(-PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(2 * PI / 3, 1.0665336288)
                .mock(-PI / 6, NaN)
                .mock(2 * PI, 2.6514961295)
                .mock(-PI / 2, NaN)
                .mock(PI / 2, 0.6514961295)
                .mock(-2 * PI, NaN)
                .mock(-3 * PI / 4, NaN);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog5Mock() {
        var m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(0d, NEGATIVE_INFINITY)
                .mock(-4 * PI / 3, NaN)
                .mock(PI / 4, -0.3485038705)
                .mock(PI, 1.6514961295)
                .mock(-PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(2 * PI / 3, 1.0665336288)
                .mock(-PI / 6, NaN)
                .mock(2 * PI, 2.6514961295)
                .mock(-PI / 2, NaN)
                .mock(PI / 2, 0.6514961295)
                .mock(-2 * PI, NaN)
                .mock(-3 * PI / 4, NaN);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog10Mock() {
        var m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(0d, NEGATIVE_INFINITY)
                .mock(-4 * PI / 3, NaN)
                .mock(PI / 4, -0.1049101186)
                .mock(PI, 0.4971498727)
                .mock(-PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(2 * PI / 3, 0.3210586136)
                .mock(-PI / 6, NaN)
                .mock(2 * PI, 0.7981798684)
                .mock(-PI / 2, NaN)
                .mock(PI / 2, 0.1961198770)
                .mock(-2 * PI, NaN)
                .mock(-3 * PI / 4, NaN);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
}
