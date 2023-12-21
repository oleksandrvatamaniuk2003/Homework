import java.util.Scanner;
public class StringArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedit' kilkist' elementiv p: ");
        int p = scanner.nextInt();
        String[] stringArray = new String[p];
        for (int i = 0; i < p; i++) {
            System.out.print("Vvedit' element #" + (i + 1) + ": ");
            scanner.nextLine(); // Очищення
            String element = scanner.nextLine();
            stringArray[i] = element;
        }
        System.out.println("Masyv ob'iektiv String:");
        for (int i = 0; i < p; i++) {
            System.out.println("Element z indeksom " + i + ": " + stringArray[i]);
        }
        scanner.close();
    }
}
