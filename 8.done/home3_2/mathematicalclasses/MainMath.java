package mathematicalclasses;

public class MainMath {
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
