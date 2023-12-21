package payment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Payment {
    private List<Item> items;

    public Payment() {
        this.items = new ArrayList<>();
    }

    public void addItem(String itemName, double itemPrice, int quantity) throws InvalidInputException {
        try {
            if (itemPrice < 0 || quantity < 0) {
                throw new IllegalArgumentException("Price and quantity must be non-negative.");
            }

            Item newItem = new Item(itemName, itemPrice, quantity);
            items.add(newItem);
        } catch (IllegalArgumentException e) {
            throw new InvalidInputException("Invalid input: " + e.getMessage());
        }
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.calculateSubtotal();
        }
        return totalAmount;
    }
    public void displayReceipt() {
        System.out.println("Receipt:");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("Total Amount: $" + calculateTotalAmount());
    }
    private static class Item {
        private String itemName;
        private double itemPrice;
        private int quantity;

        public Item(String itemName, double itemPrice, int quantity) {
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.quantity = quantity;
        }

        public double calculateSubtotal() {
            return itemPrice * quantity;
        }

        @Override
        public String toString() {
            return itemName + " - $" + itemPrice + " x " + quantity + " = $" + calculateSubtotal();
        }
    }
}
