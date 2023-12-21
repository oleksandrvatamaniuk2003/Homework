package math;

public class RationalFraction {
    private int numerator;
    private int denominator;

    public RationalFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }

        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private void simplify() {
        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // NSD
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Arithmetic operations
    public RationalFraction add(RationalFraction other) {
        int resultNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int resultDenominator = this.denominator * other.denominator;
        return new RationalFraction(resultNumerator, resultDenominator);
    }
    public RationalFraction subtract(RationalFraction other) {
        int resultNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int resultDenominator = this.denominator * other.denominator;
        return new RationalFraction(resultNumerator, resultDenominator);
    }
    public RationalFraction multiply(RationalFraction other) {
        int resultNumerator = this.numerator * other.numerator;
        int resultDenominator = this.denominator * other.denominator;
        return new RationalFraction(resultNumerator, resultDenominator);
    }
    public RationalFraction divide(RationalFraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int resultNumerator = this.numerator * other.denominator;
        int resultDenominator = this.denominator * other.numerator;
        return new RationalFraction(resultNumerator, resultDenominator);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}