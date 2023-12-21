package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TextFileOperations {
    public static void main(String[] args) {
        try {
            String filePath = "input/textFile.txt";

            // a) Display all lines of the text file
            displayAllLines(filePath);

            // b) Display lines with more than 60 characters
            displayLinesMoreThan60Chars(filePath);

            // c) Count lines based on different conditions
            char startChar = 'a';
            char endChar = 'z';
            countLinesStartWith(filePath, startChar);
            countLinesEndWith(filePath, endChar);
            countLinesStartAndEndWithSameChar(filePath);
            countLinesConsistOfIdenticalChars(filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayAllLines(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        System.out.println("a) Displaying all lines of the text file:");
        lines.forEach(System.out::println);
        System.out.println();
    }

    private static void displayLinesMoreThan60Chars(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        System.out.println("b) Displaying lines with more than 60 characters:");
        lines.stream()
                .filter(line -> line.length() > 60)
                .forEach(System.out::println);
        System.out.println();
    }

    private static void countLinesStartWith(String filePath, char startChar) throws IOException {
        long count = Files.lines(Paths.get(filePath))
                .filter(line -> line.trim().length() > 0 && line.trim().charAt(0) == startChar)
                .count();
        System.out.println("c) Number of lines starting with '" + startChar + "': " + count);
        System.out.println();
    }

    private static void countLinesEndWith(String filePath, char endChar) throws IOException {
        long count = Files.lines(Paths.get(filePath))
                .filter(line -> line.trim().length() > 0 && line.trim().charAt(line.trim().length() - 1) == endChar)
                .count();
        System.out.println("d) Number of lines ending with '" + endChar + "': " + count);
        System.out.println();
    }

    private static void countLinesStartAndEndWithSameChar(String filePath) throws IOException {
        long count = Files.lines(Paths.get(filePath))
                .filter(line -> line.trim().length() > 0 &&
                        line.trim().charAt(0) == line.trim().charAt(line.trim().length() - 1))
                .count();
        System.out.println("e) Number of lines starting and ending with the same character: " + count);
        System.out.println();
    }

    private static void countLinesConsistOfIdenticalChars(String filePath) throws IOException {
        long count = Files.lines(Paths.get(filePath))
                .filter(line -> line.trim().length() > 0 && line.trim().matches("(.)\\1*"))
                .count();
        System.out.println("f) Number of lines consisting of identical characters: " + count);
    }

    private static void countLinesStartWith(String filePath, char startChar) throws IOException {
        long count = Files.lines(Paths.get(filePath))
                .filter(line -> line.trim().length() > 0 && line.trim().charAt(0) == startChar)
                .count();
        System.out.println("g) Number of lines starting with '" + startChar + "': " + count);
        System.out.println();
    }

    private static void countLinesEndWith(String filePath, char endChar) throws IOException {
        long count = Files.lines(Paths.get(filePath))
                .filter(line -> line.trim().length() > 0 && line.trim().charAt(line.trim().length() - 1) == endChar)
                .count();
        System.out.println("h) Number of lines ending with '" + endChar + "': " + count);
        System.out.println();
    }

    private static void countLinesStartAndEndWithSameChar(String filePath) throws IOException {
        long count = Files.lines(Paths.get(filePath))
                .filter(line -> line.trim().length() > 0 &&
                        line.trim().charAt(0) == line.trim().charAt(line.trim().length() - 1))
                .count();
        System.out.println("i) Number of lines starting and ending with the same character: " + count);
        System.out.println();
    }

    private static void countLinesConsistOfIdenticalChars(String filePath) throws IOException {
        long count = Files.lines(Paths.get(filePath))
                .filter(line -> line.trim().length() > 0 && line.trim().matches("(.)\\1*"))
                .count();
        System.out.println("j) Number of lines consisting of identical characters: " + count);
    }

}