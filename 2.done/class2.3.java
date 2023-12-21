import java.util.Scanner;

public class SerednieGeometrichne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedit' pershe dіysne chyslo: ");
        double chyslo1 = scanner.nextDouble();

        System.out.print("Vvedit' druge dіysne chyslo: ");
        double chyslo2 = scanner.nextDouble();
        double serednieGeom = Math.sqrt(chyslo1 * chyslo2);
        System.out.printf("Serednie geometrychne (naukove predstavlennia): %.4e\n", serednieGeom);
        System.out.printf("Serednie geometrychne (desyatkove predstavlennia): %.4f\n", serednieGeom);
        scanner.close();
    }
}
