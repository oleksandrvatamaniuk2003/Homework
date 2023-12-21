import java.util.Scanner;
import java.util.Arrays;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмірність матриці (n m):");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        findValuesInRange(matrix, n);
        sortRows(matrix);
        System.out.println("Відредагована матриця:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        scanner.close();
    }
    private static void findValuesInRange(int[][] matrix, int n) {
        System.out.println("Елементи матриці в інтервалі від -" + n + " до " + n + ":");
        for (int[] row : matrix) {
            for (int value : row) {
                if (value >= -n && value <= n) {
                    System.out.print(value + " ");
                }
            }
        }
        System.out.println();
    }
    private static void sortRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
    }
}