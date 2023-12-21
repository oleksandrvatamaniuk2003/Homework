import payment.Payment;

public class MainPayment {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addItem("Laptop", 1200.0, 2);
        payment.addItem("Mouse", 25.0, 3);
        payment.addItem("Keyboard", 50.0, 1);
        payment.displayReceipt();
    }
}
