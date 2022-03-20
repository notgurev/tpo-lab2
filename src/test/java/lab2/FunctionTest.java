package lab2;

import lab2.logariphmic.LnCalculator;
import lab2.logariphmic.LogBaseCalculator;
import lab2.logariphmic.LogMock;
import lab2.trigonometric.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.List;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value = PER_CLASS)
public class FunctionTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private Function function;

    @BeforeAll
    public void logInCSV() {
        var sin = new SinCalculator(ACCURACY);
        var cos = new CosCalculator(ACCURACY, sin);
        var sec = new SecCalculator(ACCURACY, cos);
        var cosec = new CosecCalculator(ACCURACY, sin);
        var ln = new LnCalculator(ACCURACY);
        var log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        var log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        var log10 = new LogBaseCalculator(ACCURACY, 10, ln);
        var log3 = new LogBaseCalculator(ACCURACY, 3, ln);
        var function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);

        CsvLogger csvLogger = new CsvLogger("/csv_output/");
        List<Calculator> calculators = List.of(sin, cos, sec, cosec, ln, log2, log5, log10, log3, function);
        calculators.forEach(calculator -> csvLogger.logToCSV(calculator, -5, 5, 0.01));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void stubsTest(double expected, double num, double den) {
        function = new Function(
                ACCURACY,
                TrigonometryMocks.getSinMock(),
                TrigonometryMocks.getCosMock(),
                TrigonometryMocks.getSecMock(),
                TrigonometryMocks.getCosecMock(),
                LogMock.getLnMock(),
                LogMock.getLog2Mock(),
                LogMock.getLog5Mock(),
                LogMock.getLog10Mock(),
                LogMock.getLog3Mock()
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log2StubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosCalculator cos = TrigonometryMocks.getCosMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log5 = LogMock.getLog5Mock();
        LogBaseCalculator log10 = LogMock.getLog10Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();

        function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log5StubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosCalculator cos = TrigonometryMocks.getCosMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        LogBaseCalculator log10 = LogMock.getLog10Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();

        function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log10StubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosCalculator cos = TrigonometryMocks.getCosMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();
        LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);
        LogBaseCalculator log3 = LogMock.getLog3Mock();

        function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void log3StubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosCalculator cos = TrigonometryMocks.getCosMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();
        LogBaseCalculator log10 = LogMock.getLog10Mock();
        LogBaseCalculator log3 = new LogBaseCalculator(ACCURACY, 3, ln);

        function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void lnStubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosCalculator cos = TrigonometryMocks.getCosMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        LnCalculator ln = new LnCalculator(ACCURACY);
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);
        LogBaseCalculator log3 = new LogBaseCalculator(ACCURACY, 3, ln);

        function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void secStubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosCalculator cos = TrigonometryMocks.getCosMock();
        SecCalculator sec = new SecCalculator(ACCURACY, cos);
        CosecCalculator cosec = TrigonometryMocks.getCosecMock();
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();
        LogBaseCalculator log10 = LogMock.getLog10Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();

        function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cosecStubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosCalculator cos = TrigonometryMocks.getCosMock();
        SecCalculator sec = TrigonometryMocks.getSecMock();
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();
        LogBaseCalculator log10 = LogMock.getLog10Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();

        function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void cosStubTest(double expected, double num, double den) {
        SinCalculator sin = TrigonometryMocks.getSinMock();
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        SecCalculator sec = new SecCalculator(ACCURACY, cos);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();
        LogBaseCalculator log10 = LogMock.getLog10Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();

        function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void sinStubTest(double expected, double num, double den) {
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        SecCalculator sec = new SecCalculator(ACCURACY, cos);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = LogMock.getLnMock();
        LogBaseCalculator log2 = LogMock.getLog2Mock();
        LogBaseCalculator log5 = LogMock.getLog5Mock();
        LogBaseCalculator log10 = LogMock.getLog10Mock();
        LogBaseCalculator log3 = LogMock.getLog3Mock();

        function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void allStubTest(double expected, double num, double den) {
        SinCalculator sin = new SinCalculator(ACCURACY);
        CosCalculator cos = new CosCalculator(ACCURACY, sin);
        SecCalculator sec = new SecCalculator(ACCURACY, cos);
        CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
        LnCalculator ln = new LnCalculator(ACCURACY);
        LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
        LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
        LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);
        LogBaseCalculator log3 = new LogBaseCalculator(ACCURACY, 3, ln);

        function = new Function(ACCURACY, sin, cos, sec, cosec, ln, log2, log5, log10, log3);
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

}