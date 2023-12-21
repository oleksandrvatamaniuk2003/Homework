package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReplaceConsecutivePairs {
    public static void main(String[] args) {
        try {
            String inputFilePath = "input/input.txt";
            String inputString = readFile(inputFilePath);
            String result = replaceConsecutivePairs(inputString);
            String outputFilePath = "output/output.txt";
            writeResult(outputFilePath, result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String readFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readString(path);
    }
    private static void writeResult(String filePath, String result) throws IOException {
        Path path = Paths.get(filePath);
        Files.writeString(path, result);
    }
    private static String replaceConsecutivePairs(String input) {
        StringBuilder result = new StringBuilder();

        char prevChar = '\0'; // Initialize with a non-character
        for (char currentChar : input.toCharArray()) {
            if (currentChar != prevChar) {
                result.append(currentChar);
                prevChar = currentChar;
            }
        }
        return result.toString();
    }
}
