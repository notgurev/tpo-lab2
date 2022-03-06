package lab2.logariphmic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class Log10Test {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private LogBaseCalculator log10;

    @ParameterizedTest
    @CsvFileSource(resources = "/log10_test_data.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        log10 = new LogBaseCalculator(ACCURACY, 10, LogMock.getLnMock());
        double actual = log10.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        log10 = new LogBaseCalculator(ACCURACY, 10, LogMock.getLnMock());
        double expected = Double.NaN;
        double actual = log10.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        log10 = new LogBaseCalculator(ACCURACY, 10, LogMock.getLnMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = log10.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        log10 = new LogBaseCalculator(ACCURACY, 10, LogMock.getLnMock());
        double expected = Double.NaN;
        double actual = log10.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}