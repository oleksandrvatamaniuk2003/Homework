package class5_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        TextFileProcessor textProcessor = new TextFileProcessor("input.txt", "processedFile.txt");

        try {
            textProcessor.findLongestWord();
            textProcessor.countWords();
            textProcessor.removeExtraSpacesAndSingleLetterWords();
            textProcessor.removeSpacesAtEdgesAndBetweenWords();
            textProcessor.insertSpacesToAlignText();
            textProcessor.writeResultsToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
