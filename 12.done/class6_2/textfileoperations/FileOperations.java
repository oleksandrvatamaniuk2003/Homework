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
            double product = readAndCalculateProduct(inputFilePath);
            writeProductToFile(outputFilePath, product);

            System.out.println("Product of non-zero elements written to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static double readAndCalculateProduct(String filePath) throws IOException {
        double product = 1.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                double value = Double.parseDouble(line);

                if (value != 0.0) {
                    product *= Math.abs(value);
                }
            }
        }

        return product;
    }

    private static void writeProductToFile(String filePath, double product) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Product of non-zero elements: " + product);
        }
    }
}
