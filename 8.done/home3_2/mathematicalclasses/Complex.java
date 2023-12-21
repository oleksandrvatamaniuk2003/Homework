package mathematicalclasses;

import java.util.Arrays;

public class Complex {
    private double real;
    private double imaginary;
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }
    public Complex multiply(Complex other) {
        double resultReal = this.real * other.real - this.imaginary * other.imaginary;
        double resultImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(resultReal, resultImaginary);
    }
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double resultReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double resultImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(resultReal, resultImaginary);
    }
    public static void main(String[] args) {
        Complex[] complexArray = {
                new Complex(1, 2),
                new Complex(3, 4),
                new Complex(5, 6)
        };
        Complex sum = Arrays.stream(complexArray).reduce(new Complex(0, 0), Complex::add);
        System.out.println("Sum of complex numbers: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        Complex product = Arrays.stream(complexArray).reduce(new Complex(1, 0), Complex::multiply);
        System.out.println("Product of complex numbers: " + product.getReal() + " + " + product.getImaginary() + "i");
    }
}
