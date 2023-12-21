import java.util.Scanner;

public class PrivitPrizvyshe {

    public static void main(String[] args) {
        System.out.print("Vvedit' prizvyshe: ");
        Scanner scanner = new Scanner(System.in);
        String prizvyshe = scanner.nextLine();
        System.out.println("Privit, " + prizvyshe + "!");
        scanner.close();
    }
}
