package lab2.logariphmic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class LnTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private LnCalculator ln;

    @ParameterizedTest
    @CsvFileSource(resources = "/ln_test_data.csv")
    public void tableValuesTest(double expected, double num, double den) {
        ln = new LnCalculator(ACCURACY);
        double actual = ln.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        ln = new LnCalculator(ACCURACY);
        double expected = Double.NaN;
        double actual = ln.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        ln = new LnCalculator(ACCURACY);
        double expected = Double.POSITIVE_INFINITY;
        double actual = ln.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        ln = new LnCalculator(ACCURACY);
        double expected = Double.NaN;
        double actual = ln.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}