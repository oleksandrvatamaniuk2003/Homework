package app;
import sweets.*;
import gift.*;

public class Main {
    public static void main(String[] args) {
        // Create example
        Sweets chocolate = new Sweets("Chocolate", 100, 30);
        Candy lollipop = new Candy("Lollipop", 50, 20, "Strawberry");

        Sweets[] giftItems = { chocolate, lollipop };

        Gift newYearGift = new Gift(giftItems);

        newYearGift.displayGiftInfo();
    }
}