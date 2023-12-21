import flower.*;

public class MainFlowerShop {
    public static void main(String[] args) {
        Rose rose = new Rose(10.0, 30, 5);
        Lily lily = new Lily(8.0, 25, 7);
        Tulip tulip = new Tulip(6.0, 20, 6);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose);
        bouquet.addFlower(lily);
        bouquet.addFlower(tulip);
        System.out.println("Initial Bouquet:");
        bouquet.displayBouquet();
        System.out.println("Total Bouquet Price: $" + bouquet.calculateBouquetPrice());
        bouquet.sortFlowersByFreshness();
        System.out.println("\nSorted Bouquet by Freshness:");
        bouquet.displayBouquet();
        int minLength = 25;
        int maxLength = 35;
        Flower foundFlower = bouquet.findFlowerByStemLength(minLength, maxLength);
        System.out.println("\nFlower in Bouquet with Stem Length between " + minLength + " and " + maxLength + ":");
        System.out.println(foundFlower);
        Accessories ribbon = new Accessories("Ribbon", 2.5);
        Accessories wrapper = new Accessories("Wrapper", 1.8);
        bouquet.addFlower(new Rose(12.0, 28, 6)); // Add another
        bouquet.addFlower(new Tulip(7.0, 22, 5)); // Add another
        bouquet.addFlower(new Lily(9.0, 27, 8));  // Add another
        bouquet.addFlower(new Rose(11.0, 29, 7)); // Add another
        bouquet.displayBouquet();
        bouquet.addFlower(new Rose(11.0, 29, 7)); // Add another flower
        bouquet.addFlower(new Rose(11.0, 29, 7)); // Add another flower

        System.out.println("\nBouquet with Accessories:");
        bouquet.displayBouquet();
        System.out.println("Total Bouquet Price: $" + bouquet.calculateBouquetPrice());
    }
}
