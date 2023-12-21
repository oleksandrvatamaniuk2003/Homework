package class5_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextFileProcessor {
    private String inputFile;
    private String outputFile;
    private List<String> lines;

    public TextFileProcessor(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.lines = new ArrayList<>();
    }

    public void findLongestWord() throws IOException {
        readLinesFromFile();
        String longestWord = lines.stream()
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .filter(word -> !word.isEmpty())
                .max((word1, word2) -> word1.length() - word2.length())
                .orElse("No words found");
        System.out.println("Longest word: " + longestWord);
    }

    public void countWords() throws IOException {
        readLinesFromFile();
        long wordCount = lines.stream()
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .filter(word -> !word.isEmpty())
                .count();
        System.out.println("Word count: " + wordCount);
    }

    public void removeExtraSpacesAndSingleLetterWords() throws IOException {
        readLinesFromFile();
        List<String> processedLines = lines.stream()
                .map(line -> line.replaceAll("\\s+", " "))
                .map(line -> Arrays.stream(line.split("\\s+"))
                        .filter(word -> word.length() > 1)
                        .collect(Collectors.joining(" ")))
                .collect(Collectors.toList());
        lines = processedLines;
    }

    public void removeSpacesAtEdgesAndBetweenWords() throws IOException {
        readLinesFromFile();
        List<String> processedLines = lines.stream()
                .map(line -> line.trim().replaceAll("\\s+", " "))
                .collect(Collectors.toList());
        lines = processedLines;
    }

    public void insertSpacesToAlignText() throws IOException {
        readLinesFromFile();
        List<String> processedLines = lines.stream()
                .map(line -> insertSpacesInLine(line))
                .collect(Collectors.toList());
        lines = processedLines;
    }

    public void writeResultsToFile() throws IOException {
        FileOperations.writeFile(outputFile, lines);
    }

    private void readLinesFromFile() throws IOException {
        lines = FileOperations.readFile(inputFile);
    }

private String insertSpacesInLine(String line) {
    List<String> words = Arrays.asList(line.split("\\s+"));

    if (words.size() > 1) {
        int totalLength = words.stream().mapToInt(String::length).sum();
        int totalSpacesNeeded = 80 - totalLength;
        int spacesBetweenWords = totalSpacesNeeded / (words.size() - 1);
        int extraSpaces = totalSpacesNeeded % (words.size() - 1);

        StringBuilder alignedLine = new StringBuilder(words.get(0));
        for (int i = 1; i < words.size(); i++) {
            int spacesToAdd = spacesBetweenWords + (i <= extraSpaces ? 1 : 0);
            alignedLine.append(" ".repeat(spacesToAdd)).append(words.get(i));
        }

        return alignedLine.toString();
    }

    return line;
}
