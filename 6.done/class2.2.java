import java.util.Arrays;

public class MatrixShift {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int k = 2;
        System.out.println("Поч матриця:");
        printMatrix(matrix);
        cyclicShiftRight(matrix, k);
        System.out.println("Матриця після циклічного зсуву на " + k + " позицій вправо:");
        printMatrix(matrix);
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    private static void cyclicShiftRight(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            int[] rowCopy = Arrays.copyOf(matrix[i], cols);

            for (int j = 0; j < cols; j++) {
                matrix[i][(j + k) % cols] = rowCopy[j];
            }
        }
    }
}
