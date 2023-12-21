package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String inputFilePath = "input/input.txt";
            String inputString = readFile(inputFilePath);
            String resultA = inputString.replaceAll("[0-9]", "").replaceAll("([\\+\\-])", "$1$1");
            String resultB = inputString.replaceAll("([\\D])([0-9])", "$1");
            String resultC = inputString.replaceAll("(?<=c)[a-zA-Z]", "");
            String resultD = inputString.replaceAll("ph", "f");
            String resultE = inputString.replaceAll("\\s+", " ");
            String outputFilePath = "output/output.txt";
            writeResults(outputFilePath, resultA, resultB, resultC, resultD, resultE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String readFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readString(path);
    }
    private static void writeResults(String filePath, String... results) throws IOException {
        Path path = Paths.get(filePath);
        for (String result : results) {
            Files.writeString(path, result + System.lineSeparator(), java.nio.file.StandardOpenOption.APPEND);
        }
    }
}
