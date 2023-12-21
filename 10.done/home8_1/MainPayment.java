import payment.Payment;
import payment.InvalidInputException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPayment {
    public static void main(String[] args) {
        try {
            Payment payment = new Payment();
            addItemToPayment(payment, "Laptop");
            addItemToPayment(payment, "Mouse");
            addItemToPayment(payment, "Keyboard");

            payment.displayReceipt();
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static void addItemToPayment(Payment payment, String itemName) throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        double itemPrice;
        int quantity;
        try {
            System.out.print("Enter the price for " + itemName + ": $");
            itemPrice = scanner.nextDouble();

            System.out.print("Enter the quantity for " + itemName + ": ");
            quantity = scanner.nextInt();

            payment.addItem(itemName, itemPrice, quantity);
        } catch (InputMismatchException e) {
            throw new InvalidInputException("Invalid input. Please enter valid numeric values.");
        }
    }
}