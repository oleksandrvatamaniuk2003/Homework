public class VivedenniaZFormatuvanniam {

    public static void main(String[] args) {
        // Vykorystannya print
        System.out.print("Vikoristannya print: ");
        System.out.print("Hello, ");
        System.out.print("world!");
        System.out.println(); // Perehid na novyj
        // Vykorystannya printf
        String imya = "John";
        int vik = 25;
        double zarplata = 50000.50;
        System.out.printf("Vikoristannya printf: Imya: %s, Vik: %d, Zarplata: %.2f", imya, vik, zarplata);
    }
}
