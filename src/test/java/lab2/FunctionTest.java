package lab2;

import lab2.logariphmic.LnCalculator;
import lab2.logariphmic.LogBaseCalculator;
import lab2.logariphmic.LogMock;
import lab2.trigonometric.CosCalculator;
import lab2.trigonometric.CosecCalculator;
import lab2.trigonometric.SinCalculator;
import lab2.trigonometric.TanCalculator;
import lab2.trigonometric.TrigonomMock;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class FunctionTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private Function function;

    @AfterAll
    public void logInCSV() {
        CsvLogger csvLogger = new CsvLogger("csv_output/function.csv");
        csvLogger.log(function);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void stubsTest(double expected, double num, double den) {
        function = new Function(ACCURACY, TrigonomMock.getCosMock(), TrigonomMock.getTanMock(),
                TrigonomMock.getCosecMock(), LogMock.getLnMock(),
                LogMock.getLog2Mock(), LogMock.getLog5Mock(), LogMock.getLog10Mock());
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void sinStubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonomMock.getSinMock();
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = new LnCalculator(ACCURACY);
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);

        function = new Function(ACCURACY, cos, tan, cosec, ln, log2, log5, log10);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cosStubTest(double expected, double num, double den) {
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = TrigonomMock.getCosMock();
        TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = new LnCalculator(ACCURACY);
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);

        function = new Function(ACCURACY, cos, tan, cosec, ln, log2, log5, log10);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void tanStubTest(double expected, double num, double den) {
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        TanCalculator tan = TrigonomMock.getTanMock();
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = new LnCalculator(ACCURACY);
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);

        function = new Function(ACCURACY, cos, tan, cosec, ln, log2, log5, log10);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cosecStubTest(double expected, double num, double den) {
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
        CosecCalculator cosec = TrigonomMock.getCosecMock();
        LnCalculator ln = new LnCalculator(ACCURACY);
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);

        function = new Function(ACCURACY, cos, tan, cosec, ln, log2, log5, log10);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void lnStubTest(double expected, double num, double den) {
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);

        function = new Function(ACCURACY, cos, tan, cosec, ln, log2, log5, log10);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log2StubTest(double expected, double num, double den) {
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = new LnCalculator(ACCURACY);
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);

        function = new Function(ACCURACY, cos, tan, cosec, ln, log2, log5, log10);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log5StubTest(double expected, double num, double den) {
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log5 = LogMock.getLog5Mock();
        LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);

        function = new Function(ACCURACY, cos, tan, cosec, ln, log2, log5, log10);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log10StubTest(double expected, double num, double den) {
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        LogBaseCalculator log10 = LogMock.getLog10Mock();

        function = new Function(ACCURACY, cos, tan, cosec, ln, log2, log5, log10);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }
}