import java.util.Arrays;

public class MaxIncreasingElements {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println("Початкова матриця:");
        printMatrix(matrix);
        int maxIncreasing = findMaxIncreasing(matrix);
        if (maxIncreasing != Integer.MIN_VALUE) {
            System.out.println("Найбільше число зростаючих елементів: " + maxIncreasing);
        } else {
            System.out.println("У матриці немає зростаючих послідовностей.");
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    private static int findMaxIncreasing(int[][] matrix) {
        int maxIncreasing = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            int currentIncreasing = findIncreasingSequence(row);
            maxIncreasing = Math.max(maxIncreasing, currentIncreasing);
        }

        return maxIncreasing;
    }
    private static int findIncreasingSequence(int[] array) {
        int maxIncreasing = 1;
        int currentIncreasing = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentIncreasing++;
            } else {
                maxIncreasing = Math.max(maxIncreasing, currentIncreasing);
                currentIncreasing = 1;
            }
        }
        return Math.max(maxIncreasing, currentIncreasing);
    }
}