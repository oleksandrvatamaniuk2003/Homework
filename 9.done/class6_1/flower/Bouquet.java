package flower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void sortFlowersByFreshness() {
        Collections.sort(flowers, (f1, f2) -> f2.getFreshnessLevel() - f1.getFreshnessLevel());
    }

    public Flower findFlowerByStemLength(int minLength, int maxLength) {
        for (Flower flower : flowers) {
            int stemLength = flower.getStemLength();
            if (stemLength >= minLength && stemLength <= maxLength) {
                return flower;
            }
        }
        return null;
    }

    public double calculateBouquetPrice() {
        double total = 0;
        for (Flower flower : flowers) {
            total += flower.getPrice();
        }
        return total;
    }

    public void displayBouquet() {
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
}
