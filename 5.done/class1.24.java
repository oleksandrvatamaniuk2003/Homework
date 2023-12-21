import java.util.Scanner;

public class Rukzak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedit' kil'kist' predmetiv: ");
        int N = scanner.nextInt();

        System.out.print("Vvedit' maksymalnu vahu rukzaka: ");
        int W = scanner.nextInt();

        int[] vahy = new int[N];
        System.out.println("Vvedit' vahy predmetiv:");

        for (int i = 0; i < N; i++) {
            vahy[i] = scanner.nextInt();
        }

        int maksymalnaVaha = znajtyMaksymalnuVahuRukzaka(vahy, N, W);

        System.out.println("Maksymalna sumarna vaha predmetiv u rukzaku: " + maksymalnaVaha);

        scanner.close();
    }
    public static int znajtyMaksymalnuVahuRukzaka(int[] vahy, int n, int W) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (vahy[n - 1] > W) {
            return znajtyMaksymalnuVahuRukzaka(vahy, n - 1, W);
        } else {
            int vahaZbir = vahy[n - 1] + znajtyMaksymalnuVahuRukzaka(vahy, n - 1, W - vahy[n - 1]);
            int vahaBezZbiru = znajtyMaksymalnuVahuRukzaka(vahy, n - 1, W);
            return Math.max(vahaZbir, vahaBezZbiru);
        }
    }
}