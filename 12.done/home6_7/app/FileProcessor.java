package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileProcessor {
    public static void main(String[] args) {
        try {
            String inputFilePath = "input/inputFile.txt";
            String outputFilePath = "output/outputFile.txt";

            // a) Do not have two neighboring numbers of the same sign
            processFileA(inputFilePath, outputFilePath);

            // b) Positive numbers first, then negative numbers
            processFileB(inputFilePath, outputFilePath);

            // c) Alternating positive and negative numbers
            processFileC(inputFilePath, outputFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processFileA(String inputFilePath, String outputFilePath) throws IOException {
        List<Integer> numbers = readNumbersFromFile(inputFilePath);
        List<Integer> processedNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size() - 1; i++) {
            int current = numbers.get(i);
            int next = numbers.get(i + 1);

            if (current * next > 0) {
                numbers.set(i + 1, -next);
            }
        }
        writeNumbersToFile(outputFilePath, numbers);
    }
    private static void processFileB(String inputFilePath, String outputFilePath) throws IOException {
        List<Integer> numbers = readNumbersFromFile(inputFilePath);
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            } else {
                negativeNumbers.add(number);
            }
        }
        positiveNumbers.addAll(negativeNumbers);

        writeNumbersToFile(outputFilePath, positiveNumbers);
    }

    private static void processFileC(String inputFilePath, String outputFilePath) throws IOException {
        List<Integer> numbers = readNumbersFromFile(inputFilePath);
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            } else {
                negativeNumbers.add(number);
            }
        }

        Collections.sort(positiveNumbers);
        Collections.sort(negativeNumbers, Collections.reverseOrder());
        List<Integer> alternatingNumbers = new ArrayList<>();

        for (int i = 0; i < positiveNumbers.size(); i++) {
            alternatingNumbers.add(positiveNumbers.get(i));
            alternatingNumbers.add(negativeNumbers.get(i));
        }

        writeNumbersToFile(outputFilePath, alternatingNumbers);
    }

    private static List<Integer> readNumbersFromFile(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        List<Integer> numbers = new ArrayList<>();

        for (String line : lines) {
            numbers.add(Integer.parseInt(line.trim()));
        }

        return numbers;
    }

    private static void writeNumbersToFile(String filePath, List<Integer> numbers) throws IOException {
        List<String> lines = new ArrayList<>();

        for (int number : numbers) {
            lines.add(String.valueOf(number));
        }

        Files.write(Paths.get(filePath), lines);
    }
}
