import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedit' tsil. Vvedit' 0, shchob zakinchyty.");
        int[] numbers = readNumbers(scanner);

        if (numbers.length > 0) {
            int maxNumber = findMaxNumber(numbers);
            int minNumber = findMinNumber(numbers);

            System.out.println("Naybilshe znachennya: " + maxNumber);
            System.out.println("Naymenshe znachennya: " + minNumber);
        } else {
            System.out.println("Nemaye vvedenykh tsil.");
        }

        scanner.close();
    }
    public static int[] readNumbers(Scanner scanner) {
        int[] numbers = new int[0];
        int number;
        do {
            System.out.print("Vvedit' tsil'ko (vvedit' 0, shchob zakinchyty): ");
            number = scanner.nextInt();

            if (number != 0) {
                numbers = addElementToArray(numbers, number);
            }
        } while (number != 0);

        return numbers;
    }
    public static int findMaxNumber(int[] numbers) {
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int findMinNumber(int[] numbers) {
        int min = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int[] addElementToArray(int[] array, int element) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = element;
        return newArray;
    }
}
