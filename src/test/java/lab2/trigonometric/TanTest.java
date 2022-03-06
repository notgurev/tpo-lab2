package lab2.trigonometric;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class TanTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private TanCalculator tan;

    @ParameterizedTest
    @CsvFileSource(resources = "/tan_test_data.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        tan = new TanCalculator(ACCURACY, TrigonomMock.getSinMock(), TrigonomMock.getCosMock());
        double actual = tan.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        tan = new TanCalculator(ACCURACY, TrigonomMock.getSinMock(), TrigonomMock.getCosMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = tan.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        tan = new TanCalculator(ACCURACY, TrigonomMock.getSinMock(), TrigonomMock.getCosMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = tan.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        tan = new TanCalculator(ACCURACY, TrigonomMock.getSinMock(), TrigonomMock.getCosMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = tan.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}