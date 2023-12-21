import java.util.Scanner;

public class RealNumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedit' diyisne chyslo x: ");
        double x = scanner.nextDouble();
        double drobovaChastyna = x % 1;
        double tsilaChastyna = x - drobovaChastyna;
        System.out.println("Cila chastyna: " + tsilaChastyna);
        System.out.println("Drobova chastyna: " + drobovaChastyna);
        int najmensheCileChyslo = (int) Math.ceil(x);
        System.out.println("Najmenше cile chyslo, scho bil'she x: " + najmensheCileChyslo);
        int najbilSheCileChyslo = (int) Math.floor(x);
        System.out.println("Najbil'she cile chyslo, scho menshe x: " + najbilSheCileChyslo);
        long okrugleneZnachennyaX = Math.round(x);
        System.out.println("Okruglene znachennya x: " + okrugleneZnachennyaX);
        scanner.close();
    }
}
