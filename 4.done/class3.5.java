import java.util.Arrays;

public class Mediana {
    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Potribno vvesty ne menshe 5 tsilikh arhumentiv.");
            return;
        }
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(numbers);
        int mediana = znaidenniaMediani(numbers);
        System.out.println("Mediana: " + mediana);
    }

    public static int znaidenniaMediani(int[] sortedArray) {
        return sortedArray[2];
    }
}
