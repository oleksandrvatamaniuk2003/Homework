import java.util.Scanner;

public class SeredneIVidkhilennia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел p: ");
        int p = scanner.nextInt();
        if (p > 0) {
            double[] chysla = zchytatyChysla(scanner, p);

            double seredne = obchysltySerednie(chysla);
            double vidkhilennia = obchysltyVidkhilennia(chysla, seredne);

            System.out.println("Сере значення: " + seredne);
            System.out.println("Відхилення: " + vidkhilennia);
        } else {
            System.out.println("Некорект кількість");
        }
        scanner.close();
    }
    public static double[] zchytatyChysla(Scanner scanner, int p) {
        double[] chysla = new double[p];

        System.out.println("Введіть " + p + " дійс чисел:");

        for (int i = 0; i < p; i++) {
            System.out.print("Число #" + (i + 1) + ": ");
            chysla[i] = scanner.nextDouble();
        }
        return chysla;
    }
    public static double obchysltySerednie(double[] chysla) {
        double suma = 0;

        for (double chyslo : chysla) {
            suma += chyslo;
        }

        return suma / chysla.length;
    }
    public static double obchysltyVidkhilennia(double[] chysla, double seredne) {
        double sumaKvadratnychVidkhilen = 0;

        for (double chyslo : chysla) {
            sumaKvadratnychVidkhilen += Math.pow(chyslo - seredne, 2);
        }
        return Math.sqrt(sumaKvadratnychVidkhilen / (chysla.length - 1));
    }
}
