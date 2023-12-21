import java.util.Scanner;

public class RozradySerGarm {

    public static void main(String[] args) {
        // Vvedennya dvokh tsilykh chysel z konsoli
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedit' pershe tsile chyslo: ");
        int chyslo1 = scanner.nextInt();

        System.out.print("Vvedit' druhe tsile chyslo: ");
        int chyslo2 = scanner.nextInt();

        // Obchyslennya kil'kosti rozriadiv z vykorystanniam logaryfu
        int rozrady1 = (int) Math.log10(Math.abs(chyslo1)) + 1;
        int rozrady2 = (int) Math.log10(Math.abs(chyslo2)) + 1;

        // Vyvodymo kilkist' rozriadiv
        System.out.println("Kil'kist' rozriadiv pershogo chysla: " + rozrady1);
        System.out.println("Kil'kist' rozriadiv druhogo chysla: " + rozrady2);

        // Obchyslennya serednoho harmomichnoho
        double serednieHarm = 2.0 / ((1.0 / chyslo1) + (1.0 / chyslo2));

        // Vyvodymo serednie harmomichne z tochnistyu do dvokh znakiv pislia komy
        System.out.printf("Serednie harmomichne: %.2f\n", serednieHarm);
        scanner.close();
    }
}