package lab2.trigonometric;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class SinTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private SinCalculator sin;

    @ParameterizedTest
    @CsvFileSource(resources = "/sin_test_data.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        sin = new SinCalculator(ACCURACY);
        double actual = sin.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        sin = new SinCalculator(ACCURACY);
        double expected = Double.NaN;
        double actual = sin.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        sin = new SinCalculator(ACCURACY);
        double expected = Double.NaN;
        double actual = sin.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        sin = new SinCalculator(ACCURACY);
        double expected = Double.NaN;
        double actual = sin.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}