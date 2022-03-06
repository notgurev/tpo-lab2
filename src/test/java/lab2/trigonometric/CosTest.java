package lab2.trigonometric;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class CosTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private CosCalculator cos;

    @ParameterizedTest
    @CsvFileSource(resources = "/cos_test_data.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        cos = new CosCalculator(ACCURACY, TrigonomMock.getSinMock());
        double actual = cos.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        cos = new CosCalculator(ACCURACY, TrigonomMock.getSinMock());
        double expected = Double.NaN;
        double actual = cos.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        cos = new CosCalculator(ACCURACY, TrigonomMock.getSinMock());
        double expected = Double.NaN;
        double actual = cos.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        cos = new CosCalculator(ACCURACY, TrigonomMock.getSinMock());
        double expected = Double.NaN;
        double actual = cos.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}