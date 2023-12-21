import math.RationalFraction;
import java.util.Arrays;

public class MainProgramMath {
    public static void main(String[] args) {
        RationalFraction[] fractions = {
                new RationalFraction(1, 2),
                new RationalFraction(3, 4),
                new RationalFraction(2, 3)
        };

        System.out.println("Original Array:");
        printArray(fractions);
        modifyArray(fractions);
        System.out.println("\nModified Array:");
        printArray(fractions);
    }
    private static void modifyArray(RationalFraction[] fractions) {
        for (int i = 0; i < fractions.length - 1; i++) {
            fractions[i] = fractions[i].add(fractions[i + 1]);
        }
    }
    private static void printArray(RationalFraction[] fractions) {
        for (RationalFraction fraction : fractions) {
            System.out.println(fraction);
        }
    }
}
