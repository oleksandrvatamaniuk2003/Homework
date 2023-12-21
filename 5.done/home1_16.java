import java.util.Scanner;

public class FoldArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть довжину масиву: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        foldArray(array);
        System.out.println("Згорнутий масив:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        scanner.close();
    }
    public static void foldArray(int[] array) {
        int currentIndex = 0;
        while (currentIndex < array.length) {
            int currentNumber = array[currentIndex];
            int count = 0;
            while (currentIndex < array.length && array[currentIndex] == currentNumber) {
                count++;
                currentIndex++;
            }
            array[currentIndex - count] = count * currentNumber;
        }
    }
}
