package lab2;

public abstract class Calculator {
    protected double accuracy;

    public Calculator(double accuracy) {
        this.accuracy = accuracy;
    }

    public abstract double calculate(double x);
}
