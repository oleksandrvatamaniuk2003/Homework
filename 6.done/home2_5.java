import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмірність квадратної матриці (n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Введіть елементи матриці:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Початкова матриця:");
        printMatrix(matrix);
        int[][] transposedMatrix = transpose(matrix);
        System.out.println("Транспонована матриця:");
        printMatrix(transposedMatrix);
        scanner.close();
    }
    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
