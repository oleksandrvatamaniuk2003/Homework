import java.util.Scanner;

public class A2_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedit' tseloe chyslo n: ");
        int n = scanner.nextInt();
        System.out.print("Vvedit' chyslo m: ");
        int m = scanner.nextInt();
        int result = flipBit(n, m);
        System.out.println("Rezul'tat: " + result);
        scanner.close();
    }

    public static int flipBit(int n, int m) {
        int mask = 1 << m;

        return n ^ mask;
    }
}
