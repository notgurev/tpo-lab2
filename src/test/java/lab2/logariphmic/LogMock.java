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
                .mock(-PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(2 * PI / 3, 0.7392647777)
                .mock(-PI / 6, NaN)
                .mock(-PI / 2, NaN)
                .mock(-2 * PI, NaN)
                .mock(-3 * PI / 4, NaN)
                .mock(-5 * PI / 4, NaN)
                .mock(-7 * PI / 4, NaN)
                .mock(1 * PI / 6, -0.6470295833786549)
                .mock(1 * PI / 4, -0.2415644752704905)
                .mock(1 * PI / 3, 0.046117597181290375)
                .mock(2 * PI / 3, 0.7392647777412357)
                .mock(3 * PI / 4, 0.8570478133976193)
                .mock(5 * PI / 6, 0.9624083290554456)
                .mock(7 * PI / 6, 1.2988805656766584)
                .mock(5 * PI / 4, 1.3678734371636099)
                .mock(4 * PI / 3, 1.432411958301181)
                .mock(5 * PI / 3, 1.6555555096153909)
                .mock(7 * PI / 4, 1.7043456737848228)
                .mock(11 * PI / 6, 1.7508656894197157)
                .mock(PI, 1.1447298858494002)
                .mock(2 * PI, 1.8378770664093453)
                .mock(PI / 2, 0.4515827052894548)
                .mock(2, 0.6931471805599453)
                .mock(5, 1.6094379124341003)
                .mock(10, 2.302585092994);

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
                .mock(PI, 1.0419780460)
                .mock(-PI / 4, NaN)
                .mock(PI / 4, -0.2198814612)
                .mock(-PI, NaN)
                .mock(2 * PI / 3, 0.6729077996)
                .mock(-PI / 6, NaN)
                .mock(-PI / 2, NaN)
                .mock(PI / 2, 0.4110482924)
                .mock(2 * PI, 1.6729077996)
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
                .mock(PI, 0.7112606687)
                .mock(-PI / 4, NaN)
                .mock(PI / 4, -0.1500924474)
                .mock(-PI, NaN)
                .mock(2 * PI / 3, 0.4593310323)
                .mock(-PI / 6, NaN)
                .mock(-PI / 2, NaN)
                .mock(PI / 2, 0.2805841106)
                .mock(2 * PI, 1.1419372268)
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
