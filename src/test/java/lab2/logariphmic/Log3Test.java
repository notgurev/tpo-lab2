package lab2.logariphmic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class Log3Test {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private LogBaseCalculator log3;

    @ParameterizedTest
    @CsvFileSource(resources = "/log3_test_data.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        log3 = new LogBaseCalculator(ACCURACY, 3, LogMock.getLnMock());
        double actual = log3.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        log3 = new LogBaseCalculator(ACCURACY, 3, LogMock.getLnMock());
        double expected = Double.NaN;
        double actual = log3.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        log3 = new LogBaseCalculator(ACCURACY, 3, LogMock.getLnMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = log3.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        log3 = new LogBaseCalculator(ACCURACY, 3, LogMock.getLnMock());
        double expected = Double.NaN;
        double actual = log3.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
