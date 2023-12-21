package binaryfiles;

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
            double sum = readAndCalculateSum(inputFilePath);
            writeSumToFile(outputFilePath, sum);

            System.out.println("Sum of numbers written to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static double readAndCalculateSum(String filePath) throws IOException {
        double sum = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                sum += Double.parseDouble(line);
            }
        }

        return sum;
    }

    private static void writeSumToFile(String filePath, double sum) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Sum of numbers: " + sum);
        }
    }
}
