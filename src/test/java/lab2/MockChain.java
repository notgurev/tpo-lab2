package lab2;

import org.mockito.Mockito;

public class MockChain {
    private final Calculator calculator;

    public MockChain(Calculator calculator) {
        this.calculator = calculator;
    }

    public static MockChain when(Calculator calculator) {
        return new MockChain(calculator);
    }

    public MockChain mock(double x, double y) {
        Mockito.when(calculator.calculate(x)).thenReturn(y);
        return this;
    }
}
