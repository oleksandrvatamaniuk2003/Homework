package square;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquationSolver {
    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the value for coefficient A: ");
        float coefficientA = inputScanner.nextFloat();
        System.out.print("Enter the value for coefficient B: ");
        float coefficientB = inputScanner.nextFloat();
        System.out.print("Enter the value for coefficient C: ");
        float coefficientC = inputScanner.nextFloat();

        try {
            if (coefficientA == 0)
                throw new ArithmeticException("Coefficient A can't be zero!!!");

            double discriminant = Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;

            if (discriminant < 0)
                throw new CustomSqrnException("Discriminant is negative, no real roots!!!");

            double sqrtDiscriminant = Math.sqrt(discriminant);
            double root1 = (-coefficientB + sqrtDiscriminant) / (2 * coefficientA);
            double root2 = (-coefficientB - sqrtDiscriminant) / (2 * coefficientA);

            System.out.println("Roots: Root 1 = " + root1 + ", Root 2 = " + root2);

        } catch (CustomSqrnException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
