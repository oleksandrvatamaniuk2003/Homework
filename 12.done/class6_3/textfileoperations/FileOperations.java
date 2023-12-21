package textfileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        String inputFilePath = "data/input.txt";
        String outputFilePath = "data/output.txt";
        try {
            long product = readAndCalculateProduct(inputFilePath);
            writeProductToFile(outputFilePath, product);
            System.out.println("Product of even elements written to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static long readAndCalculateProduct(String filePath) throws IOException {
        long product = 1L;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                int value = Integer.parseInt(line);
                if (value % 2 == 0) {
                    product *= value;
                }
            }
        }
        return product;
    }
    private static void writeProductToFile(String filePath, long product) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Product of even elements: " + product);
        }
    }
}
