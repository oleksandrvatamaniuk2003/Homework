package gift;
import sweets.*;

import java.util.Arrays;

public class Gift {
    private Sweets[] sweets;
    public Gift(Sweets[] sweets) {
        this.sweets = sweets;
    }
    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Sweets sweet : sweets) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }
    public void sortSweetsBySugarContent() {
        // Sortuvannia
        Arrays.sort(sweets, (s1, s2) -> Double.compare(s1.getSugarContent(), s2.getSugarContent()));
    }
    public Sweets findSweetBySugarContentRange(double minSugar, double maxSugar) {
        for (Sweets sweet : sweets) {
            double sugarContent = sweet.getSugarContent();
            if (sugarContent >= minSugar && sugarContent <= maxSugar) {
                return sweet;
            }
        }
        return null; // Nemaye zukerky
    }
    public void displayGiftInfo() {
        System.out.println("Gift Content:");
        for (Sweets sweet : sweets) {
            sweet.displayInfo();
            System.out.println("-------------------");
        }
        System.out.println("Total Weight of Gift: " + calculateTotalWeight() + " grams");
    }
}
