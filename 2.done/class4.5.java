import java.util.Scanner;
import java.lang.Math;

public class p4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vvedit' (x1 y1):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Vvedit' (x2 y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Vvedit' (x3 y3):");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double s = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        System.out.println("Ploscha = " + s);

        sc.close();
    }
}