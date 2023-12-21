import java.lang.Math;

public class CustomFunctions {
    public static void main(String[] args) {
        double x = 2.0;
        double functionResult = functionA(x);
        System.out.println("f(x) = e^x - tanh(x) - (e^x + e^(-x)), where x = " + x + ": " + functionResult);
        double derivativeResult = functionA_derivative(x);
        System.out.println("g(x) = Derivative of f(x), where x = " + x + ": " + derivativeResult);
    }
    public static double functionA(double x) {
        double term1 = Math.exp(x);
        double term2 = Math.tanh(x);
        double term3 = Math.exp(x) + Math.exp(-x);

        return term1 - term2 - term3;
    }
    public static double functionA_derivative(double x) {
        double derivative = Math.exp(x) - Math.pow(1 / Math.cosh(x), 2) - (Math.exp(x) - Math.exp(-x));
        return derivative;
    }
}
