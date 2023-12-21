import java.util.Scanner;

public class PorivnanniaRyadkiv {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedit' pershyi ryadok: ");
        String ryadok1 = scanner.nextLine();
        System.out.print("Vvedit' dryugi ryadok: ");
        String ryadok2 = scanner.nextLine();
        if (ryadok1.equals(ryadok2)) {
            System.out.println("Ryadky rivni.");
        } else {
            System.out.println("Ryadky ne rivni.");
        }
        scanner.close();
    }
}