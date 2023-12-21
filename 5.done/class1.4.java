import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NajbilshyyRaz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedit' kilkist' chysel': ");
        int k = scanner.nextInt();

        if (k > 0) {
            int[] chysla = new int[k];
            System.out.println("Vvedit' " + k + " chysel:");

            for (int i = 0; i < k; i++) {
                chysla[i] = scanner.nextInt();
            }

            Map<Integer, Integer> kilkist = obchysltyNaybilshuKilkist(chysla);

            if (!kilkist.isEmpty()) {
                int naybilshyyElement = znaytyNaybilshyyElement(kilkist);
                int naybilshyyRaz = kilkist.get(naybilshyyElement);

                System.out.println("Naybil'sha kilkist' maє chyslo " + naybilshyyElement +
                                   " - zustrichayeєtsya " + naybilshyyRaz + " raziv.");
            } else {
                System.out.println("Vse chysla vvedeno odnakovo - nemozhlivo zнайти naybil'she.");
            }
        } else {
            System.out.println("Nekorektna kilkist'.");
        }

        scanner.close();
    }

    public static Map<Integer, Integer> obchysltyNaybilshuKilkist(int[] chysla) {
        Map<Integer, Integer> kilkist = new HashMap<>();

        for (int chyslo : chysla) {
            kilkist.put(chyslo, kilkist.getOrDefault(chyslo, 0) + 1);
        }

        return kilkist;
    }

    public static int znaytyNaybilshyyElement(Map<Integer, Integer> kilkist) {
        int naybilshyyElement = 0;
        int maxKilkist = 0;

        for (Map.Entry<Integer, Integer> entry : kilkist.entrySet()) {
            if (entry.getValue() > maxKilkist) {
                maxKilkist = entry.getValue();
                naybilshyyElement = entry.getKey();
            }
        }

        return naybilshyyElement;
    }
}
