import java.util.Arrays;
public class SumBetweenMax {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 3, 4},
            {9, 6, 7, 8},
            {2, 10, 11, 12}
        };
        System.out.println("Початкова матриця:");
        printMatrix(matrix);
        int sumBetweenMax = findSumBetweenMax(matrix);
        if (sumBetweenMax != Integer.MIN_VALUE) {
            System.out.println("Сума елементів між першим і другим максимальними: " + sumBetweenMax);
        } else {
            System.out.println("У матриці немає достатньо елементів для обчислення суми.");
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    private static int findSumBetweenMax(int[][] matrix) {
        int sumBetweenMax = 0;

        for (int[] row : matrix) {
            int[] maxIndices = findTwoMaxIndices(row);

            if (maxIndices != null) {
                int start = Math.min(maxIndices[0], maxIndices[1]) + 1;
                int end = Math.max(maxIndices[0], maxIndices[1]) - 1;

                if (start >= 0 && end >= 0 && start < row.length && end < row.length) {
                    for (int i = start; i <= end; i++) {
                        sumBetweenMax += row[i];
                    }
                }
            }
        }

        return sumBetweenMax != 0 ? sumBetweenMax : Integer.MIN_VALUE;
    }
    private static int[] findTwoMaxIndices(int[] array) {
        int firstMaxIndex = -1;
        int secondMaxIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (firstMaxIndex == -1 || array[i] > array[firstMaxIndex]) {
                secondMaxIndex = firstMaxIndex;
                firstMaxIndex = i;
            } else if (secondMaxIndex == -1 || array[i] > array[secondMaxIndex]) {
                secondMaxIndex = i;
            }
        }

        return (firstMaxIndex != -1 && secondMaxIndex != -1) ? new int[]{firstMaxIndex, secondMaxIndex} : null;
    }
}